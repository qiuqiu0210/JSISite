package cn.edu.buaa.jsi.entities;

/**
 * Created by Home on 2014-08-15.
 */
public class Note {
    private int noteId;
    private String noteContent;

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (noteId != note.noteId) return false;
        if (noteContent != null ? !noteContent.equals(note.noteContent) : note.noteContent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noteId;
        result = 31 * result + (noteContent != null ? noteContent.hashCode() : 0);
        return result;
    }
}
