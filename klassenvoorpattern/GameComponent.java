public interface GameComponent extends HGraphicButton {
	// vervangt constructor
	public void init(int x, int y,String bitmap,int scale);
	public void paint(Graphics g);
}