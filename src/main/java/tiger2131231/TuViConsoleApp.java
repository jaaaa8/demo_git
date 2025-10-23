package tiger2131231;

import java.util.Scanner;

public class TuViConsoleApp {

    private static final String[] TONG_QUAN = {
            "Hôm nay là một ngày đầy năng lượng tích cực!",
            "Bạn nên nghỉ ngơi và tránh căng thẳng quá mức.",
            "Cơ hội mới đang đến gần, đừng ngại thử thách.",
            "Sự kiên nhẫn sẽ mang lại thành công bất ngờ.",
            "Cẩn thận với những quyết định vội vàng."
    };

    private static final String[] TINH_DUYEN = {
            "Tình cảm thăng hoa, có cơ hội gặp người đặc biệt.",
            "Người cũ có thể xuất hiện, hãy suy nghĩ kỹ trước khi quyết định.",
            "Tình duyên bình ổn, hai người hiểu nhau hơn.",
            "Cần lắng nghe và chia sẻ nhiều hơn với người ấy.",
            "Hôm nay là ngày lý tưởng để bày tỏ tình cảm."
    };

    private static final String[] CONG_VIEC = {
            "Công việc tiến triển thuận lợi, được cấp trên ghi nhận.",
            "Cần tập trung hơn, tránh bị phân tâm.",
            "Hợp tác với đồng nghiệp sẽ mang lại kết quả tốt.",
            "Sẽ có cơ hội thăng tiến nếu bạn thể hiện năng lực.",
            "Cẩn trọng trong giao tiếp nơi làm việc."
    };

    private static final String[] TAI_CHINH = {
            "Tài lộc dồi dào, có thể nhận tin vui về tiền bạc.",
            "Hạn chế chi tiêu không cần thiết.",
            "Đầu tư hôm nay cần suy nghĩ kỹ.",
            "Một khoản thu bất ngờ có thể đến.",
            "Hãy học cách quản lý tài chính cá nhân tốt hơn."
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🌟 CHƯƠNG TRÌNH TỬ VI BÓI TOÁN VUI 🌟");
        System.out.print("Nhập ngày sinh của bạn (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Nhập tháng sinh của bạn (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm sinh của bạn (VD: 1998): ");
        int year = scanner.nextInt();

        System.out.println("\n🔮 KẾT QUẢ TỬ VI CỦA BẠN 🔮");
        String zodiac = getZodiacSign(day, month);
        System.out.println("Cung hoàng đạo: " + zodiac);

        int index = (day + month + year) % 5; // sinh số cố định

        System.out.println("\n📜 TỔNG QUAN: " + TONG_QUAN[index]);
        System.out.println("❤️ TÌNH DUYÊN: " + TINH_DUYEN[index]);
        System.out.println("💼 CÔNG VIỆC: " + CONG_VIEC[index]);
        System.out.println("💰 TÀI CHÍNH: " + TAI_CHINH[index]);

        System.out.println("\n✨ Chúc bạn một ngày an lành và may mắn!");
        scanner.close();
    }

    private static String getZodiacSign(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Bạch Dương ♈";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Kim Ngưu ♉";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Song Tử ♊";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cự Giải ♋";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Sư Tử ♌";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Xử Nữ ♍";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Thiên Bình ♎";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Bọ Cạp ♏";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Nhân Mã ♐";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Ma Kết ♑";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Bảo Bình ♒";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Song Ngư ♓";
        return "Không xác định";
    }
}

