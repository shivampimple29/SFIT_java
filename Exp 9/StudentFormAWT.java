import java.awt.*;
import java.awt.event.*;

public class StudentFormAWT extends Frame implements ActionListener {
Label nameLabel, rollLabel, deptLabel, hostelLabel;
TextField nameField, rollField, deptField;
Checkbox hostelCheckbox;
Button submitButton;
TextArea outputArea;

// Constructor
StudentFormAWT() {
setTitle("Student Information Form");
setSize(450, 400);
setLayout(null);
setBackground(new Color(240, 248, 255)); // Light background

// Initialize components
nameLabel = new Label("Name:");
rollLabel = new Label("Roll Number:");
deptLabel = new Label("Department:");
hostelLabel = new Label("Hostel Facility:");

nameField = new TextField();
rollField = new TextField();
deptField = new TextField();

hostelCheckbox = new Checkbox("Required");
submitButton = new Button("Submit");
outputArea = new TextArea();
outputArea.setEditable(false);

// Set bounds (x, y, width, height)
nameLabel.setBounds(50, 70, 100, 25);
nameField.setBounds(160, 70, 200, 25);

rollLabel.setBounds(50, 110, 100, 25);
rollField.setBounds(160, 110, 200, 25);

deptLabel.setBounds(50, 150, 100, 25);
deptField.setBounds(160, 150, 200, 25);

hostelLabel.setBounds(50, 190, 100, 25);
hostelCheckbox.setBounds(160, 190, 150, 25);

submitButton.setBounds(160, 230, 100, 30);

outputArea.setBounds(50, 280, 350, 80);

// Add components to frame
add(nameLabel); add(nameField);
add(rollLabel); add(rollField);
add(deptLabel); add(deptField);
add(hostelLabel); add(hostelCheckbox);
add(submitButton);
add(outputArea);

// Register event handler
submitButton.addActionListener(this);

// Close button handler
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
dispose();

}
});

setVisible(true);
}

// Handle button click
public void actionPerformed(ActionEvent e) {
String name = nameField.getText();
String roll = rollField.getText();
String dept = deptField.getText();
boolean hostel = hostelCheckbox.getState();

String info = "---- Student Information ----\n"
+ "Name: " + name + "\n"
+ "Roll Number: " + roll + "\n"
+ "Department: " + dept + "\n"
+ "Hostel Facility: " + (hostel ? "Required" : "Not Required");

outputArea.setText(info);
}

public static void main(String[] args) {
new StudentFormAWT();
}
}