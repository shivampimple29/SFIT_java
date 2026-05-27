import java.awt.*;
import java.awt.event.*;

public class TravelBookingAWT extends Frame implements ActionListener {
    // UI components
    private Label destLabel, modeLabel, statusLabel;
    private Choice destChoice;
    private CheckboxGroup modeGroup;
    private Checkbox busRb, trainRb, flightRb;
    private Button bookBtn;

    public TravelBookingAWT() {
        super("Travel Booking Form (AWT)");
        setLayout(null);
        setSize(480, 320);
        setBackground(new Color(248, 250, 252)); // subtle light tone

        // --- Destination (Label + Choice) ---
        destLabel = new Label("Destination City:");
        destLabel.setBounds(40, 50, 120, 24);
        add(destLabel);
        destChoice = new Choice();
        // Add a placeholder + a few cities
        destChoice.add("-- Select --");
        destChoice.add("Mumbai");
        destChoice.add("Delhi");
        destChoice.add("Bengaluru");
        destChoice.add("Chennai");
        destChoice.add("Kolkata");
        destChoice.setBounds(180, 50, 240, 24);
        add(destChoice);

        // --- Travel Mode (CheckboxGroup acts like Radio Buttons) ---
        modeLabel = new Label("Travel Mode:");
        modeLabel.setBounds(40, 95, 120, 24);
        add(modeLabel);
        modeGroup = new CheckboxGroup();
        busRb = new Checkbox("Bus", modeGroup, false);
        trainRb = new Checkbox("Train", modeGroup, false);
        flightRb = new Checkbox("Flight", modeGroup, false);
        busRb.setBounds(180, 95, 70, 24);
        trainRb.setBounds(260, 95, 70, 24);
        flightRb.setBounds(340, 95, 70, 24);
        add(busRb);
        add(trainRb);
        add(flightRb);

        // --- Book Now Button ---
        bookBtn = new Button("Book Now");
        bookBtn.setBounds(180, 140, 100, 32);
        add(bookBtn);

        // Optional status label (inline feedback)
        statusLabel = new Label("");
        statusLabel.setBounds(40, 190, 400, 24);
        add(statusLabel);

        // Events
        bookBtn.addActionListener(this);

        // Proper window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setResizable(false);
        setVisible(true);
    }

    // Utility: show a simple modal dialog with booking summary
    private void showSummaryDialog(String title, String message) {
        Dialog dlg = new Dialog(this, title, true); // modal
        dlg.setLayout(new BorderLayout(10, 10));
        TextArea ta = new TextArea(message, 6, 40,
                TextArea.SCROLLBARS_VERTICAL_ONLY);
        ta.setEditable(false);
        Panel south = new Panel(new FlowLayout(FlowLayout.CENTER));
        Button ok = new Button("OK");
        south.add(ok);
        dlg.add(ta, BorderLayout.CENTER);
        dlg.add(south, BorderLayout.SOUTH);
        ok.addActionListener(ev -> dlg.dispose());
        dlg.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dlg.dispose();
            }
        });
        dlg.setSize(380, 220);
        dlg.setLocationRelativeTo(this);
        dlg.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String city = destChoice.getSelectedItem();
        Checkbox sel = modeGroup.getSelectedCheckbox();

        // Minimal validation
        if (city == null || city.equals("-- Select --")) {
            statusLabel.setText("Please select a destination city.");
            return;
        }

        if (sel == null) {
            statusLabel.setText("Please choose a travel mode (Bus / Train / Flight).");
            return;
        }

        String mode = sel.getLabel();
        String summary = "***** Booking Summary *****\n"
                + "Destination: " + city + "\n"
                + "Travel Mode: " + mode + "\n\n"
                + "Your booking request has been recorded.";

        statusLabel.setText("Booking created for " + city + " via " + mode + ".");
        showSummaryDialog("Booking Confirmed", summary);
    }

    public static void main(String[] args) {
        new TravelBookingAWT();
    }
}