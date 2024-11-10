import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05024 {
    public static class SV {
        private String id;
        private String name;
        private String className;
        private String email;

        public SV(String id, String name, String className, String email) {
            this.id = id;
            this.name = name;
            this.className = className;
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public String getClassName() {
            return className;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + className + " " + email;
        }
    }

    public static class Department {
        private String name;
        private String code;
        private boolean excludeClassE;

        public Department(String name, String code, boolean excludeClassE) {
            this.name = name;
            this.code = code;
            this.excludeClassE = excludeClassE;
        }

        public boolean matches(SV student) {
            if (student.getId().contains(code)) {
                if (excludeClassE && student.getClassName().startsWith("E")) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<SV> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String id = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            String className = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            students.add(new SV(id, name, className, email));
        }

        Department[] departments = new Department[5];
        departments[0] = new Department("Ke toan", "DCKT", false);
        departments[1] = new Department("Cong nghe thong tin", "DCCN", true);
        departments[2] = new Department("An toan thong tin", "DCAT", true);
        departments[3] = new Department("Vien thong", "DCVT", false);
        departments[4] = new Department("Dien tu", "DCDT", false);

        int q = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < q; i++) {
            String query = sc.nextLine().trim();
            for (Department department : departments) {
                if (department.getName().equalsIgnoreCase(query)) {
                    System.out.println("DANH SACH SINH VIEN NGANH " + department.getName().toUpperCase() + ":");
                    for (SV student : students) {
                        if (department.matches(student)) {
                            System.out.println(student);
                        }
                    }
                    break;
                }
            }
        }
    }
}