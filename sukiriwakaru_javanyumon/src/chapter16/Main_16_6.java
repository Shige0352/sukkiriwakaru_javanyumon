package chapter16;

public class Main_16_6 {

	public class HelloAndroid extends Activity {
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			TextView tv = new TextView(this);
			tv.setText("Hello world");
			setContentView(tv);
		}
	}


}
