package org.computer;

public class Desktop extends Computer {
private void desktopSize() {
System.out.println("1920*1080");
}
public static void main(String[] args) {
	Desktop g = new Desktop();
	g.desktopSize();
	g.computerModel();
	g.computerName();
}
}
