public class Karyawan {
    private DaftarPegawai[] staffList;
 
    public Karyawan() {
        staffList = new DaftarPegawai[8];
 
        staffList[0] = new Direktur("Fakhrie", "123 Bandung", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Pegawai("Rizdan", "456 Banjaran", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Pegawai("Muzakki", "789 Jakarta", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new PekerjaLepas("Indah", "678 Cimahi", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Sukarela("Ratu", "987 Supratman", "555-8374");
        staffList[5] = new Sukarela("Pramudita", "321 Gerlong", "555-7282");
        staffList[6] = new Komisi("Raditya", "745 Ciwastra", "555-1234", "111-22-3333", 6.25, 0.20);
        staffList[7] = new Komisi("Ryuki", "5678 Garut", "555-5678", "444-55-6666", 9.75, 0.15);
 
        ((Komisi)staffList[6]).addSales(400);
        ((PekerjaLepas)staffList[6]).addHours(35);
        ((Komisi)staffList[7]).addSales(950);
        ((PekerjaLepas)staffList[7]).addHours(40);
    }
 
    public void gajian() {
        for (DaftarPegawai member : staffList) {
            System.out.println(member);
            double amount = member.gajian();
            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
            System.out.println("-----------------------------------");
        }
    }
 }
 