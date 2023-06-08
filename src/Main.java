import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Students[] students = new Students[2];


//        Nhập thông tin sinh viên
        for (int i = 0; i < students.length; i++) {
            Students s = new Students();
            System.out.print("Nhập vào tên của bạn: ");
            s.setName(sc.nextLine());
            System.out.print("Nhập vào tuổi của bạn: ");
            s.setAge(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhập vào điểm Toán: ");
            s.setToan(Double.parseDouble(sc.nextLine()));
            System.out.print("Nhập vào điểm Lý: ");
            s.setLy(Double.parseDouble(sc.nextLine()));
            System.out.print("Nhập vào điểm Hóa: ");
            s.setHoa(Double.parseDouble(sc.nextLine()));
            System.out.println();
            students[i] = s;
        }

//        In thông tin sinh viên
        System.out.println("--------------------------------");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Tên : " + students[i].getName());
            System.out.println("Tuổi : " + students[i].getAge());
            System.out.println("Điểm Toán : " + students[i].getToan());
            System.out.println("Điểm Lý : " + students[i].getLy());
            System.out.println("Điểm Hóa : " + students[i].getHoa());
            System.out.println("--------------------------------");
        }
    }
}
