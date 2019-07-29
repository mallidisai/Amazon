import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class voiceautomationmale {

	public static void main(String[] args) {
		// get text
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String x = sc.nextLine();
		// convert into voice
		VoiceManager vm = VoiceManager.getInstance();
		Voice v = vm.getVoice("kevin");
		v.allocate();
		v.speak(x);
		v.deallocate();
	}
}
