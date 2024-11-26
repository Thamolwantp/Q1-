package src.main.java;
public class HealthRiskPingPong {

    public static void main(String[] args) {

        int bloodPressure = 145;
        int bloodSugar = 150;  
        String riskGroup = classifyRiskGroup(bloodPressure, bloodSugar);
        System.out.println("ค่าความดันโลหิต: " + bloodPressure);
        System.out.println("ค่าน้ำตาลในเลือด: " + bloodSugar);
        System.out.println("ผลการตรวจสอบ: " + riskGroup);
    }

    public static String classifyRiskGroup(int bloodPressure, int bloodSugar) {
        if (bloodPressure <= 120 && bloodSugar < 100) {
            return "กลุ่มปกติ (สีขาว)";
        }
        else if (bloodPressure >= 120 && bloodPressure <= 139 && bloodSugar >= 100 && bloodSugar <= 125) {
            return "กลุ่มเสี่ยง (สีเขียว)";
        }
        else if (bloodPressure >= 140 && bloodPressure <= 159 && bloodSugar >= 125 && bloodSugar <= 154) {
            return "กลุ่มป่วย ระดับ 1 (สีเหลือง)";
        }
        else if (bloodPressure >= 160 && bloodPressure <= 179 && bloodSugar >= 155 && bloodSugar <= 182) {
            return "กลุ่มป่วย ระดับ 2 (สีส้ม)";
        }
        else if (bloodPressure >= 180 && bloodSugar >= 183) {
            return "กลุ่มป่วย ระดับ 3 (สีแดง)";
        }
        else {
            return "ไม่สามารถจัดกลุ่มได้";
        }
    }
}
