import java.util.*;

public class Chord {
	
	private int root;
	private String rootName;
	private String fullName;
	private List<Integer> notes;
	private List<String> noteNames;
	
	//Create enum for chord type
	private enum ChordType {
		Major, Minor, Dominant7th, Major7th, Minor7th, Augmented, Diminished 
	}
	
	private ChordType type;
	
	
	//Setters and getters for chord type
	public ChordType getType() {
		return type;
	}

	public void setType(ChordType type) {
		this.type = type;
	}

	//Method that subtracts 12 from any integer over 11 and returns the value. Used to simulate octaves. Used later
	private static int cap12(int i) {
		if (i >= 12) {
			i -= 12;
		}
		return i;
	}
	
	//Setters and getters for root integer
	public int getRoot() {
		return root;
	}
	public void setRoot(int root) {
		this.root = root;
	}
	
	//Define method that translates an integer into a note name, used later
	public String findNoteName(int note) {
		String noteName;
		switch (note) {
		case 0:
			noteName = "A";
			break;
		case 1:
			noteName = "A#/Bb";
			break;
		case 2: 
			noteName = "B";
			break;
		case 3:
			noteName = "C";
			break;
		case 4:
			noteName = "C#/Db";
			break;
		case 5:
			noteName ="D";
			break;
		case 6:
			noteName = "D#/Eb";
			break;
		case 7:
			noteName = "E";
			break;
		case 8:
			noteName = "F";
			break;
		case 9:
			noteName = "F#/Gb";
			break;
		case 10:
			noteName = "G";
			break;
		case 11:
			noteName = "G#/Ab";
			break;
		default:
			noteName = "dunno";
			break;
		}
		return noteName;
	}
	
	//Setters and getters for root note name
	public void setRootName(int root) {
		rootName = findNoteName(root);
	}
	
	public String getRootName() {
		return rootName;
	}
	
	//Setters and getters for note integers based on root and type
	public void setNotes(int root, ChordType type) {
		this.notes = new ArrayList<Integer>();
		switch (type) {
		case Major:
			this.notes.add(this.root);
			this.notes.add(cap12(this.root + 4));
			this.notes.add(cap12(this.root + 7));
			break;
		case Minor:
			this.notes.add(this.root);
			this.notes.add(cap12(this.root + 3));
			this.notes.add(cap12(this.root + 7));
			break;
		case Dominant7th:
			this.notes.add(this.root);
			this.notes.add(cap12(this.root + 4));
			this.notes.add(cap12(this.root + 7));
			this.notes.add(cap12(this.root + 10));
			break;
		case Major7th:
			this.notes.add(this.root);
			this.notes.add(cap12(this.root + 4));
			this.notes.add(cap12(this.root + 7));
			this.notes.add(cap12(this.root + 11));
			break;
		case Minor7th:
			this.notes.add(this.root);
			this.notes.add(cap12(this.root + 3));
			this.notes.add(cap12(this.root + 7));
			this.notes.add(cap12(this.root + 10));
			break;
		case Augmented:
			this.notes.add(this.root);
			this.notes.add(cap12(this.root + 4));
			this.notes.add(cap12(this.root + 8));
			break;
		case Diminished:
			this.notes.add(this.root);
			this.notes.add(cap12(this.root + 3));
			this.notes.add(cap12(this.root + 6));
			break;
		}
	}
	
	public List<Integer> getNotes() {
		return notes;
	}
	
	//Setters and getters for note names based on list of notes
	public void setNoteNames(List<Integer> notes) {
		this.noteNames = new ArrayList<String>();
		for (Integer note : notes) {
			this.noteNames.add(findNoteName(note));
		}
	}
	
	public List<String> getNoteNames() {
		return noteNames;
	}
	
	//Setters and getters for full name based on root name and type
	public String getFullName() {
		return fullName;
	}
	public void setFullName() {
		this.fullName = this.rootName + " " + this.type;
	}

	//Constructor

	public Chord(int root, int typeIndex) {
		super();
		this.root = root;
		this.type = ChordType.values()[typeIndex];
		this.setRootName(root);
		this.setFullName();
		this.setNotes(this.root, this.type);
		this.setNoteNames(this.notes);
	}
	
}
