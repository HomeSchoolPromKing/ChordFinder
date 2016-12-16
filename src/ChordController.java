import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ToggleGroup;

public class ChordController {
	
	ObservableList<String> notesList = FXCollections.observableArrayList(
			"A", "A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab");
	
	@FXML
	private ChoiceBox<String> rootBox;
	
	@FXML
	private ToggleGroup chordType;
	
	@FXML
	private RadioButton majButton;
	
	@FXML
	private RadioButton minButton;
	
	@FXML
	private RadioButton dom7Button;
	
	@FXML
	private RadioButton maj7Button;
	
	@FXML
	private RadioButton min7Button;
	
	@FXML
	private RadioButton augButton;
	
	@FXML
	private RadioButton dimButton;
	
	@FXML
	private Label chordNameLabel;
	
	@FXML
	private Label notesLabel;
	
	private int rootIndex = 3;
	private int typeIndex = 0;
	Chord userChord = new Chord(rootIndex, typeIndex);
	
	@FXML
	public void initialize () {
		rootBox.setItems(notesList);
		rootBox.setValue("C");
		ChangeListener<String> rootListener = new ChangeListener<String>() {
			 @Override
			 public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				 switch(newValue) {
				 case "A":
					 rootIndex = 0;
					 break;
				 case "A#/Bb":
					 rootIndex = 1;
					 break;
				 case "B":
					 rootIndex = 2;
					 break;
				 case "C":
					 rootIndex = 3;
					 break;
				 case "C#/Db": 
					 rootIndex = 4;
					 break;
				 case "D":
					 rootIndex = 5;
					 break;
				 case "D#/Eb":
					 rootIndex = 6;
					 break;
				 case "E":
					 rootIndex = 7;
					 break;
				 case "F":
					 rootIndex = 8;
					 break;
				 case "F#/Gb":
					 rootIndex = 9;
					 break;
				 case "G":
					 rootIndex = 10;
					 break;
				 case "G#/Ab":
					 rootIndex = 11;
					 break;
				 default:
					 break;
				 }
				 userChord = new Chord(rootIndex, typeIndex);
					chordNameLabel.setText(userChord.getFullName());
					notesLabel.setText(userChord.getNoteNames().toString());
			 }
		};
		rootBox.getSelectionModel().selectedItemProperty().addListener(rootListener);
		chordNameLabel.setText(userChord.getFullName());
		notesLabel.setText(userChord.getNoteNames().toString());
	}
	
	//Event Listener for Major Radio Button
	public void majListener() {
		if (majButton.isSelected()) {
			typeIndex = 0;
			userChord = new Chord(rootIndex, typeIndex);
			chordNameLabel.setText(userChord.getFullName());
			notesLabel.setText(userChord.getNoteNames().toString());
			}
		}
	
	public void minListener() {
		if (minButton.isSelected()) {
			typeIndex = 1;
			userChord = new Chord(rootIndex, typeIndex);
			chordNameLabel.setText(userChord.getFullName());
			notesLabel.setText(userChord.getNoteNames().toString());
			}
		}
	
	public void dom7Listener() {
		if (dom7Button.isSelected()) {
			typeIndex = 2;
			userChord = new Chord(rootIndex, typeIndex);
			chordNameLabel.setText(userChord.getFullName());
			notesLabel.setText(userChord.getNoteNames().toString());
			}
		}
	
	public void maj7Listener() {
		if (maj7Button.isSelected()) {
			typeIndex = 3;
			userChord = new Chord(rootIndex, typeIndex);
			chordNameLabel.setText(userChord.getFullName());
			notesLabel.setText(userChord.getNoteNames().toString());
			}
		}
	
	public void min7Listener() {
		if (min7Button.isSelected()) {
			typeIndex = 4;
			userChord = new Chord(rootIndex, typeIndex);
			chordNameLabel.setText(userChord.getFullName());
			notesLabel.setText(userChord.getNoteNames().toString());
			}
		}
	
	public void augListener() {
		if (augButton.isSelected()) {
			typeIndex = 5;
			userChord = new Chord(rootIndex, typeIndex);
			chordNameLabel.setText(userChord.getFullName());
			notesLabel.setText(userChord.getNoteNames().toString());
			}
		}
	
	public void dimListener() {
		if (dimButton.isSelected()) {
			typeIndex = 6;
			userChord = new Chord(rootIndex, typeIndex);
			chordNameLabel.setText(userChord.getFullName());
			notesLabel.setText(userChord.getNoteNames().toString());
			}
		}
	
 
}
	
	


