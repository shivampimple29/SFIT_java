import java.awt.*;
import java.awt.event.*;

public class StudentFeedbackAWT extends Frame implements ActionListener {
    private Label nameLbl, fbLbl;
    private TextField nameTf;
    private TextArea fbTa;
    private Checkbox anonymousCb;
    private Button submitBtn;

    public StudentFeedbackAWT() {
        super("Student Feedback (AWT)");
        setLayout(null);

        nameLbl = new Label("Name:");
        fbLbl = new Label("Feedback:");
        nameTf = new TextField();
        fbTa = new TextArea();
        anonymousCb = new Checkbox("Submit as Anonymous");
        submitBtn = new Button("Submit");

        // Absolute positioning for simplicity (matches typical lab style)
        nameLbl.setBounds(40, 60, 80, 24);
        nameTf.setBounds(130, 60, 240, 24);
        fbLbl.setBounds(40, 100, 80, 24);
        fbTa.setBounds(130, 100, 240, 120);
        anonymousCb.setBounds(130, 230, 200, 24);
        submitBtn.setBounds(130, 270, 100, 30);

        add(nameLbl); add(nameTf);
        add(fbLbl); add(fbTa);
        add(anonymousCb);
        add(submitBtn);

        submitBtn.addActionListener(this);

        // Proper window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); }
        });

        setSize(420, 360);
        setResizable(false);
        setVisible(true);
    }

    // Utility: show a modal AWT Dialog with message and Close button
    private void showDialog(String title, String message) {
        final Dialog dlg = new Dialog(this, title, true); // modal
        dlg.setLayout(new BorderLayout(10, 10));

        TextArea msg = new TextArea(message, 8, 40, TextArea.SCROLLBARS_VERTICAL_ONLY);
        msg.setEditable(false);

        Panel south = new Panel(new FlowLayout(FlowLayout.CENTER));
        Button close = new Button("Close");
        south.add(close);

        dlg.add(msg, BorderLayout.CENTER);
        dlg.add(south, BorderLayout.SOUTH);

        close.addActionListener(ev -> dlg.dispose());
        dlg.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dlg.dispose(); }
        });

        dlg.setSize(420, 260);
        dlg.setLocationRelativeTo(this);
        dlg.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameTf.getText().trim();
        String feedback = fbTa.getText().trim();

        if (anonymousCb.getState()) {
            name = "Anonymous";
        } else if (name.isEmpty()) {
            name = "(No name entered)";
        }

        if (feedback.isEmpty()) {
            feedback = "(No feedback provided)";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("***** Feedback Received *****\n");
        sb.append("Name: ").append(name).append("\n\n");
        sb.append("Feedback:\n").append(feedback);

        showDialog("Submission", sb.toString());
    }

    public static void main(String[] args) {
        new StudentFeedbackAWT();
    }
}