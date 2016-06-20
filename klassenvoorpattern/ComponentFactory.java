public class ComponentFactory {
	public static GameComponent getInstance(String sort){
		switch(sort){
			case "Klaasje":
				return new MijnComponent();
				break;
			case "Hanne":
				return new HanneComponent();
				break;
			default:
				return new MijnComponent();
				break;
		}
	}
}