public class MainClass {
    public static void main(String[] args) {
        Doctor d1= new Doctor(01,"Dr.Bilal","Khan","080223111","A Block,Gandhi Nagar,Gurgaon","Paediatrician");
        Doctor d2= new Doctor(02,"Dr.Pradeep","Kansal","0802653819","C Block,Nehru Nagar,Hisar","Paediatrician");

        Patient p1 = new Patient(01, "Aryan","Chougala","8867878776","HMS,Hisar");
        Patient p2 = new Patient(02, "Rehaan","Rai","9569878756","PLA market,Hisar");

        System.out.println("Doctor Details : "+d1.firstName+ " "+d1.lastName + " Specialiazation : "+d1.specialization);
        System.out.println("Doctor contact Details : "+d1.contactNumber);

        System.out.println("Doctor Details : "+d2.firstName+ " "+d2.lastName + " Specialiazation : "+d2.specialization);
        System.out.println("Doctor contact Details : "+d2.contactNumber);

        System.out.println("Patient Details : "+p1.firstName+ " "+p1.lastName );
        System.out.println("Patient contact Details : "+p1.contactNumber);

        System.out.println("Patient Details : "+p2.firstName+ " "+p2.lastName );
        System.out.println("Patient contact Details : "+p2.contactNumber);
    }
}
