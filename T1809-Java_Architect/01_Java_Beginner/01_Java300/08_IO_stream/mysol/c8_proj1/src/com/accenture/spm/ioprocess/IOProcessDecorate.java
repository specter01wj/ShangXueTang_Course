package com.accenture.spm.ioprocess;

public class IOProcessDecorate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

