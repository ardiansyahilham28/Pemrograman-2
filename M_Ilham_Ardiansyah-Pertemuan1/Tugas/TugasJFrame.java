import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * GUI setara latihan1.java (konsol -> JFrame Form).
 * Logika sama: minta angka 1-10, tolak di luar range, terima jika valid.
 *
 * Cara run:
 *   javac TugasJFrame.java
 *   java TugasJFrame
 *
 * Catatan NetBeans: file ini bisa dibuka via
 * New > JFrame Form lalu copy isi ini, atau Run File langsung.
 */
public class TugasJFrame extends JFrame {

    private JLabel labelInstruksi;
    private JTextField textAngka;
    private JButton buttonCek;
    private JLabel labelPesan;

    public TugasJFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Tugas - Validasi Angka 1-10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380, 200);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        labelInstruksi = new JLabel("masukan angka (1-10):");
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(labelInstruksi, gbc);

        textAngka = new JTextField(10);
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1; gbc.weightx = 1.0;
        add(textAngka, gbc);

        buttonCek = new JButton("Cek / Simpan");
        gbc.gridx = 1; gbc.gridy = 1; gbc.weightx = 0;
        add(buttonCek, gbc);

        labelPesan = new JLabel(" ");
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        add(labelPesan, gbc);

        // Event = pengganti do-while di versi konsol
        buttonCek.addActionListener((ActionEvent evt) -> cekAngka());
        textAngka.addActionListener((ActionEvent evt) -> cekAngka());
    }

    private void cekAngka() {
        String input = textAngka.getText().trim();
        int angka;

        try {
            angka = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            labelPesan.setText("angka tidak valid, silahkan coba lagi.");
            System.out.println("angka tidak valid, silahkan coba lagi.");
            return;
        }

        if (angka < 1 || angka > 10) {
            labelPesan.setText("angka tidak valid, silahkan coba lagi.");
            System.out.println("angka tidak valid, silahkan coba lagi.");
        } else {
            labelPesan.setText("Terima kasih! Angka " + angka + " berhasil disimpan.");
            System.out.println("Terima kasih! Angka " + angka + " berhasil disimpan.");
            // JOptionPane.showMessageDialog(this,
            //         "Terima kasih! Angka " + angka + " berhasil disimpan.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TugasJFrame().setVisible(true));
    }
}
