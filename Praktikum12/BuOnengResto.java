import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BuOnengResto extends JFrame {
    private JTextField namaField, alamatField, telpField;
    private JCheckBox baksoCheckBox, seblakCheckBox, burgerCheckBox, steakCheckBox, spaghettiCheckBox, pizzaCheckBox;
    private JLabel totalLabel;
    private JTextArea pesananArea;
    private int totalBayar = 0;

    public BuOnengResto() {
        setTitle("Bu Oneng Resto");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        getContentPane().setBackground(new Color(173, 216, 230));

        JPanel dataCustomerPanel = new JPanel(new GridLayout(3, 2));
        dataCustomerPanel.setBorder(BorderFactory.createTitledBorder("Data Customer"));
        dataCustomerPanel.setBackground(new Color(224, 255, 255));

        dataCustomerPanel.add(new JLabel("Nama:", JLabel.RIGHT));
        namaField = new JTextField();
        dataCustomerPanel.add(namaField);

        dataCustomerPanel.add(new JLabel("Alamat:", JLabel.RIGHT));
        alamatField = new JTextField();
        dataCustomerPanel.add(alamatField);

        dataCustomerPanel.add(new JLabel("No Telp:", JLabel.RIGHT));
        telpField = new JTextField();
        dataCustomerPanel.add(telpField);

        add(dataCustomerPanel, BorderLayout.NORTH);

        JPanel menuPanel = new JPanel(new GridLayout(3, 2));
        menuPanel.setBorder(BorderFactory.createTitledBorder("Menu Resto Bu Oneng"));
        menuPanel.setBackground(new Color(224, 238, 238));

        baksoCheckBox = new JCheckBox("Bakso (15000)");
        seblakCheckBox = new JCheckBox("Seblak (15000)");
        burgerCheckBox = new JCheckBox("Burger (25000)");
        steakCheckBox = new JCheckBox("Steak (40000)");
        spaghettiCheckBox = new JCheckBox("Spaghetti (35000)");
        pizzaCheckBox = new JCheckBox("Pizza (50000)");

        menuPanel.add(baksoCheckBox);
        menuPanel.add(seblakCheckBox);
        menuPanel.add(burgerCheckBox);
        menuPanel.add(steakCheckBox);
        menuPanel.add(spaghettiCheckBox);
        menuPanel.add(pizzaCheckBox);

        add(menuPanel, BorderLayout.CENTER);

        JPanel bayarPanel = new JPanel();
        bayarPanel.setLayout(new BoxLayout(bayarPanel, BoxLayout.Y_AXIS));
        bayarPanel.setBackground(new Color(173, 216, 230));

        JLabel totalLabelTitle = new JLabel("TOTAL");
        totalLabelTitle.setFont(new Font("Arial", Font.BOLD, 16));
        totalLabelTitle.setForeground(Color.BLACK);
        totalLabelTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        bayarPanel.add(totalLabelTitle);

        totalLabel = new JLabel("Rp 0", SwingConstants.CENTER);
        totalLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        totalLabel.setForeground(Color.WHITE);
        totalLabel.setBackground(Color.BLACK);
        totalLabel.setOpaque(true);
        totalLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        totalLabel.setPreferredSize(new Dimension(150, 30));
        totalLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        bayarPanel.add(totalLabel);

        bayarPanel.add(Box.createVerticalStrut(10));

        JButton tambahButton = new JButton("Submit");
        tambahButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        tambahButton.setBackground(Color.WHITE);
        tambahButton.setForeground(Color.BLACK);
        tambahButton.setFocusPainted(false);
        tambahButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tambahButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        bayarPanel.add(tambahButton);

        add(bayarPanel, BorderLayout.EAST);

        pesananArea = new JTextArea();
        pesananArea.setEditable(false);
        pesananArea.setBackground(new Color(245, 245, 245));
        JScrollPane scrollPane = new JScrollPane(pesananArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Data Penjualan"));
        add(scrollPane, BorderLayout.SOUTH);

        baksoCheckBox.addActionListener(e -> updateTotal());
        seblakCheckBox.addActionListener(e -> updateTotal());
        burgerCheckBox.addActionListener(e -> updateTotal());
        steakCheckBox.addActionListener(e -> updateTotal());
        spaghettiCheckBox.addActionListener(e -> updateTotal());
        pizzaCheckBox.addActionListener(e -> updateTotal());

        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahPesanan();
            }
        });
    }

    private void updateTotal() {
        totalBayar = 0;
        if (baksoCheckBox.isSelected()) totalBayar += 15000;
        if (seblakCheckBox.isSelected()) totalBayar += 15000;
        if (burgerCheckBox.isSelected()) totalBayar += 25000;
        if (steakCheckBox.isSelected()) totalBayar += 40000;
        if (spaghettiCheckBox.isSelected()) totalBayar += 35000;
        if (pizzaCheckBox.isSelected()) totalBayar += 50000;
        totalLabel.setText("Rp " + totalBayar);
    }

    private void tambahPesanan() {
        String nama = namaField.getText();
        String alamat = alamatField.getText();
        String telp = telpField.getText();

        StringBuilder pesanan = new StringBuilder();
        pesanan.append("Nama: ").append(nama).append("\n");
        pesanan.append("Alamat: ").append(alamat).append("\n");
        pesanan.append("Telp: ").append(telp).append("\n");
        pesanan.append("Pesanan:\n");

        if (baksoCheckBox.isSelected()) pesanan.append(" - Bakso (15000)\n");
        if (seblakCheckBox.isSelected()) pesanan.append(" - Seblak (15000)\n");
        if (burgerCheckBox.isSelected()) pesanan.append(" - Burger (25000)\n");
        if (steakCheckBox.isSelected()) pesanan.append(" - Steak (40000)\n");
        if (spaghettiCheckBox.isSelected()) pesanan.append(" - Spaghetti (35000)\n");
        if (pizzaCheckBox.isSelected()) pesanan.append(" - Pizza (50000)\n");

        pesanan.append("------------------------------\n");
        pesanan.append("Total Bayar: Rp ").append(totalBayar).append("\n\n");

        pesananArea.append(pesanan.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BuOnengResto frame = new BuOnengResto();
            frame.setVisible(true);
        });
    }
}
