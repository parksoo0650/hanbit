/*
 To.개발자님께
초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 
만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.

public class TimeCalc {
public static void main(String[] args) {
Scanner scanner = new Scanner(System. in);
System. out.println( "초를 시간과 분으로 바꾸어주는 프로그램입니다.");
System. out.println( "초를 입력해주세요." );
// 나머지를 완성하세요
// 여기에서 추가로 필요한 문법은 
// 나눗셈 기호에서 / 는 몫을 % 는 나머지를 구합니다.
// 예를들어 63/6 = 10 이고 63%6 = 3 입니다.
 * */

package ifelse;
import java.util.Scanner;
public class TimeClac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hour = 0, minute = 0;
		
		System.out.println("초를 시간과 분으로 바꾸어주는 프로그램입니다.");
		System.out.println("초를 입력해주세요.");
		int second = s.nextInt();
		
		hour = second / 60;
		minute = second % 60;
		
		System.out.println(second + "초는 " + hour + "시간" + minute + "분 입니다.");
		}
}
