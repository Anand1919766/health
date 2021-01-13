package enumerations;

public class TrafficSignal {

	public static void main(String[] args) {
		
		EnumTrafficSignal[] signals = EnumTrafficSignal.values();
		
		for(EnumTrafficSignal signal : signals) {
			System.out.println("Name : " + signal.name() + " -> Action : " + signal.getAction());
		}

	}

}
