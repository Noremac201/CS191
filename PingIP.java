import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PingIP {
	public static void runSystemCommand(String command) {
		try {
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String s = "";
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fileCheck() throws IOException {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("myfile.txt", true)))) {
			for (int n = 1; n < 86; n++) {
				String ip = "oldschool" + n + ".runescape.com";
				switch (n) {
				case 15 | 23 | 24 | 31 | 32 | 39 | 40 | 47 | 48 | 55 | 56 | 63 | 64 | 71 | 72 | 79 | 80:
					System.out.println("somethings workign");
				default:
					out.println("Testing " + n);
					runSystemCommand("ping " + ip + " -c 1");
				}
			}
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}
	}

	public static void main(String[] args) throws IOException {
		fileCheck();

	}
}
