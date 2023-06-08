package ConsoleGame;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = {11, 12, 13, 14, 15};

        boolean check = true;
        while (check) {
            int choose = showMenu(sc);
            switch (choose) {
                case 1:
                    System.out.println("-----------------------");
                    System.out.println("Array 1 : " + Arrays.toString(arr1));
                    System.out.println("-----------------------");
                    System.out.println("Array 2 : " + Arrays.toString(arr2));
                    System.out.println("-----------------------");
                    System.out.println("Array 3 : " + Arrays.toString(arr3));
                    System.out.println("-----------------------");
                    break;
                case 2:
                    System.out.println("-----------------------");
                    System.out.println("Lựa chọn mảng muốn gộp:");
                    System.out.print("Mảng 1 : ");
                    int luaChon1 = Integer.parseInt(sc.nextLine());
                    System.out.print("Mảng 2 : ");
                    int luaChon2 = Integer.parseInt(sc.nextLine());
                    System.out.println("-----------------------");
//                    Gộp mảng
                    if (luaChon1 == 1 && luaChon2 == 2) {
                        int[] newArr = gopMang(arr1, arr2);
                        System.out.println("Mảng mới : " + Arrays.toString(newArr));
                    } else if (luaChon1 == 1 && luaChon2 == 3) {
                        int[] newArr = gopMang(arr1, arr3);
                        System.out.println("Mảng mới : " + Arrays.toString(newArr));
                    } else if(luaChon1 == 2 && luaChon2 == 3) {
                        int[] newArr = gopMang(arr2, arr3);
                        System.out.println("Mảng mới : " + Arrays.toString(newArr));
                    } else {
                        System.out.println("Chúng tôi không có mảng đấy :>>");
                    }
                    System.out.println("-----------------------");
                    break;
                case 3:
                    int[] newArr = gopMang3(arr1, arr2, arr3);
                    System.out.println("-----------------------");
                    System.out.println("Mảng mới : " + Arrays.toString(newArr));
                    System.out.println("-----------------------");
                    break;
                case 4:
                    System.out.print("\nMời bạn lựa chọn mảng muốn thay đổi: ");
                    int luaChonMang = Integer.parseInt(sc.nextLine());
                    switch (luaChonMang) {
                        case 1:
                            System.out.println("-----------------------");
                            System.out.println("Array 1 before : " + Arrays.toString(arr1));
                            System.out.println("-----------------------");
                            arr1 = showSubMenu(sc, arr1);
                            System.out.println("Nhập vào lựa chọn của bạn: ");
                            System.out.println("-----------------------");
                            System.out.println("Array 1 after" + Arrays.toString(arr1));
                            System.out.println("-----------------------");
                            break;
                        case 2:
                            System.out.println("-----------------------");
                            System.out.println("Array 2 before : " + Arrays.toString(arr2));
                            System.out.println("-----------------------");
                            arr2 = showSubMenu(sc, arr2);
                            System.out.println("Nhập vào lựa chọn của bạn: ");
                            System.out.println("-----------------------");
                            System.out.println("Array 2 after" + Arrays.toString(arr2));
                            System.out.println("-----------------------");
                            break;
                        case 3:
//                            Print Arrays before changes
                            System.out.println("-----------------------");
                            System.out.println("Array 3 before : " + Arrays.toString(arr3));
                            System.out.println("-----------------------");
                            arr3 = showSubMenu(sc, arr3);
                            System.out.println("Nhập vào lựa chọn của bạn: ");
//                            Print Arrays after changes
                            System.out.println("-----------------------");
                            System.out.println("Array 3 after :" + Arrays.toString(arr3));
                            System.out.println("-----------------------");
                            break;
                        default:
                            System.out.println("Chúng tôi không có mảng đấy :>>");
                            break;
                    }
                    break;
                case 5:
                    System.out.println(" ~~ Cảm ơn bạn đã dùng chương trình của tôi ~~ ");
                    check = false;
                    break;
                default:
                    System.out.println("Bạn đã lựa chọn sai nền văn minh");
                    break;
            }
        }
    }


    private static int[] showSubMenu(Scanner sc, int[] arr) {
        System.out.print("\n4.1 Thêm 1 phần tử vào cuối \n4.2 Thêm 1 phần tử vào đầu \n4.3 Xóa phần tử tại vị trí index");
        System.out.print("\nMời bạn nhập lựa chọn của bạn: ");
        int subMenu = Integer.parseInt(sc.nextLine());
        switch (subMenu) {
            case 1:
                return addValueToEnd(sc, arr);
            case 2:
                return addValueToStart(sc, arr);
            case 3:
                return removeValueByIndex(sc, arr);
            default:
                System.out.println("Bạn đã lựa chọn sai nền văn minh :>>");
                return arr;
        }
    }

    private static int[] removeValueByIndex(Scanner sc, int[] arr) {
        System.out.print("\nNhập vào index bạn muốn xóa: ");
        int index = Integer.parseInt(sc.nextLine());

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            }
            if (i >= index) {
                newArr[i] = arr[i + 1];
            }
        }
        return newArr;
    }

    private static int[] addValueToStart(Scanner sc, int[] arr) {
        System.out.println("Nhập vào giá trị bạn muốn chèn: ");
        int value = Integer.parseInt(sc.nextLine());

        int[] newArr = new int[arr.length + 1];
        newArr[0] = value;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    private static int[] addValueToEnd(Scanner sc, int[] arr) {
        System.out.println("Nhập vào giá trị bạn muốn chèn: ");
        int value = Integer.parseInt(sc.nextLine());

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < arr.length) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = value;
            }
        }
        return newArr;
    }

    private static int showMenu(Scanner sc) {
        System.out.print("1. Hiển thị ra 3 mảng \n2.Hiển thị mảng gộp 2 mảng \n3.Hiển thị mảng gộp từ 3 mảng \n4.Chọn 1 mảng số nguyên \n5.Dừng chương trình");
        System.out.print("\nXin mời bạn lựa chọn: ");
        int choose = Integer.parseInt(sc.nextLine());
        return choose;
    }

    private static int[] gopMang(int[] temp1, int[] temp2) {
        int[] newArr = new int[temp1.length + temp2.length];

        for (int i = 0; i < newArr.length; i++) {
            if (i < temp1.length) {
                newArr[i] = temp1[i];
            } else {
                newArr[i] = temp2[i - temp1.length];
            }
        }

        return newArr;
    }

    private static int[] gopMang3(int[] temp1, int[] temp2, int[] temp3) {
        int[] newArr = new int[temp1.length + temp2.length + temp3.length];
        int index = 0;

        for (int i = 0; i < temp1.length; i++) {
            newArr[index] = temp1[i];
            index++;
        }
        for (int i = 0; i < temp2.length; i++) {
            newArr[index] = temp2[i];
            index++;
        }
        for (int i = 0; i < temp3.length; i++) {
            newArr[index] = temp3[i];
            index++;
        }

        return newArr;
    }

}
