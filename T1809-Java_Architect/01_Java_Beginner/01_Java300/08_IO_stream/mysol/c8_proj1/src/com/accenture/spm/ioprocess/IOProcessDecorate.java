package com.accenture.spm.ioprocess;

public class IOProcessDecorate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.say();
		
		Amplifier am = new Amplifier(p);
		am.say();
	}

}


interface Say {
	void say();
}

class Person implements Say {
	
	private int voice = 10;
	
	@Override
	public void say() {
		System.out.println("Voice: " + this.getVoice());
	}

	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}
	

}

class Amplifier implements Say {
	
	private Person p;
	
	public Amplifier(Person p) {
		this.p = p;
	}

	@Override
	public void say() {
		System.out.println("Voice: " + p.getVoice()*100);
		System.out.println("Noise!!!");
	}
}

