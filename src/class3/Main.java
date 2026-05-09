package class3;

import class3.role.Lion;
import class3.role.Member;
import class3.role.Staff;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("멋쟁이사자처럼 구성원 관리 시스템");

        System.out.println("\n[ 아기사자 정보 입력 ]");
        Member lion = createLion(sc);
        System.out.println("→ Lion 객체 생성 완료\n");

        System.out.println("[ 운영진 정보 입력 ]");
        Member staff = createStaff(sc);
        System.out.println("→ Staff 객체 생성 완료\n");

        System.out.println("[ 구성원 정보 및 과제 제출 가능 여부 ]\n");
        printMemberInfo(lion);
        System.out.println();
        printMemberInfo(staff);

        sc.close();
    }

    private static Lion createLion(Scanner sc) {
        System.out.print("  이름  : "); String name       = sc.nextLine().trim();
        System.out.print("  전공  : "); String major      = sc.nextLine().trim();
        System.out.print("  기수  : "); int    generation = Integer.parseInt(sc.nextLine().trim());
        System.out.print("  파트  : "); String part       = sc.nextLine().trim();
        System.out.print("  학번  : "); String studentId  = sc.nextLine().trim();
        return new Lion(name, major, generation, part, studentId);
    }

    private static Staff createStaff(Scanner sc) {
        System.out.print("  이름  : "); String name       = sc.nextLine().trim();
        System.out.print("  전공  : "); String major      = sc.nextLine().trim();
        System.out.print("  기수  : "); int    generation = Integer.parseInt(sc.nextLine().trim());
        System.out.print("  파트  : "); String part       = sc.nextLine().trim();
        System.out.print("  직책  : "); String position   = sc.nextLine().trim();
        return new Staff(name, major, generation, part, position);
    }

    private static void printMemberInfo(Member member) {
        System.out.println(member.getDetailInfo());
        System.out.println("제출여부: " + (member.canSubmit() ? "과제 제출 가능" : "과제 제출 불가"));
        System.out.println("──────────────────");
    }
}
