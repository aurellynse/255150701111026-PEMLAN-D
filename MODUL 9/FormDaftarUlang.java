import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormDaftarUlang extends JFrame implements ActionListener {

    JTextField tfNama, tfNIM, tfEmail, tfNoHP;
    JTextArea taAlamat;
    JComboBox<String> cbJurusan;
    JRadioButton rbLaki, rbPerempuan;
    JButton btnSubmit;

    public FormDaftarUlang() {

        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setSize(500, 550);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel title = new JLabel("FORM DAFTAR ULANG");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(120, 20, 300, 30);
        add(title);

        // Nama
        JLabel lNama = new JLabel("Nama");
        lNama.setBounds(30, 80, 100, 25);
        add(lNama);

        tfNama = new JTextField();
        tfNama.setBounds(150, 80, 250, 25);
        add(tfNama);

        // NIM
        JLabel lNIM = new JLabel("NIM");
        lNIM.setBounds(30, 120, 100, 25);
        add(lNIM);

        tfNIM = new JTextField();
        tfNIM.setBounds(150, 120, 250, 25);
        add(tfNIM);

        // Email
        JLabel lEmail = new JLabel("Email");
        lEmail.setBounds(30, 160, 100, 25);
        add(lEmail);

        tfEmail = new JTextField();
        tfEmail.setBounds(150, 160, 250, 25);
        add(tfEmail);

        // No HP
        JLabel lHP = new JLabel("No HP");
        lHP.setBounds(30, 200, 100, 25);
        add(lHP);

        tfNoHP = new JTextField();
        tfNoHP.setBounds(150, 200, 250, 25);
        add(tfNoHP);

        // Jenis Kelamin
        JLabel lJK = new JLabel("Jenis Kelamin");
        lJK.setBounds(30, 240, 100, 25);
        add(lJK);

        rbLaki = new JRadioButton("Laki-laki");
        rbPerempuan = new JRadioButton("Perempuan");

        rbLaki.setBounds(150, 240, 100, 25);
        rbPerempuan.setBounds(260, 240, 120, 25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbLaki);
        bg.add(rbPerempuan);

        add(rbLaki);
        add(rbPerempuan);

        // Jurusan
        JLabel lJurusan = new JLabel("Jurusan");
        lJurusan.setBounds(30, 280, 100, 25);
        add(lJurusan);

        String jurusan[] = {
            "Teknik Informatika",
            "Sistem Informasi",
            "Teknik Komputer",
            "Teknologi Informasi"
        };

        cbJurusan = new JComboBox<>(jurusan);
        cbJurusan.setBounds(150, 280, 250, 25);
        add(cbJurusan);

        // Alamat
        JLabel lAlamat = new JLabel("Alamat");
        lAlamat.setBounds(30, 320, 100, 25);
        add(lAlamat);

        taAlamat = new JTextArea();

        JScrollPane sp = new JScrollPane(taAlamat);
        sp.setBounds(150, 320, 250, 80);
        add(sp);

        // Submit
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(180, 430, 120, 35);
        add(btnSubmit);

        btnSubmit.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // validasi kosong
        if(tfNama.getText().isEmpty() ||
           tfNIM.getText().isEmpty() ||
           tfEmail.getText().isEmpty() ||
           tfNoHP.getText().isEmpty() ||
           taAlamat.getText().isEmpty() ||
           (!rbLaki.isSelected() && !rbPerempuan.isSelected())) {

            JOptionPane.showMessageDialog(
                this,
                "Semua kolom harus diisi!"
            );

            return;
        }

        // konfirmasi
        int pilihan = JOptionPane.showConfirmDialog(
            this,
            "Apakah anda yakin data yang Anda isi sudah benar?",
            "Konfirmasi",
            JOptionPane.OK_CANCEL_OPTION
        );

        // jika OK
        if(pilihan == JOptionPane.OK_OPTION) {

            JFrame hasil = new JFrame("Data Mahasiswa");
            hasil.setSize(400, 400);
            hasil.setLayout(new FlowLayout());

            JTextArea output = new JTextArea(15, 30);

            output.setText(
                "===== DATA MAHASISWA =====\n\n" +
                "Nama : " + tfNama.getText() + "\n" +
                "NIM : " + tfNIM.getText() + "\n" +
                "Email : " + tfEmail.getText() + "\n" +
                "No HP : " + tfNoHP.getText() + "\n" +
                "Jenis Kelamin : " +
                (rbLaki.isSelected() ? "Laki-laki" : "Perempuan") + "\n" +
                "Jurusan : " + cbJurusan.getSelectedItem() + "\n" +
                "Alamat : " + taAlamat.getText()
            );

            output.setEditable(false);

            hasil.add(new JScrollPane(output));

            hasil.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new FormDaftarUlang();
    }
}
