package sg.edu.rp.c346.id21025432.demodatabasecrud;

import static android.provider.Contacts.SettingsColumns.KEY;

import java.io.Serializable;

public class note implements Serializable {



    private  	int id;
    private 	String noteContent;

    public note( int id, String noteContent  ) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {  return id;  }

    public String getNoteContent() { return noteContent; }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Override
    public String toString() { return "ID:" + id + ", " + noteContent;  }

}

