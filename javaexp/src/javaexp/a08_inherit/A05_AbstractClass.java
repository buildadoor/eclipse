package javaexp.a08_inherit;

import java.util.ArrayList;

public class A05_AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Comp com new Comp(); 추상 클래스는 하위 클래스의 다형성을 위한 클래스라서 혼자 객체 생성 안됨 
		Comp com1 = new Samsung01();
		com1.earnMoney();
		com1.working();
		/* 다시1!11111111111111111111111111
		Larva l01 = new Zergglng();
		Larva l02 = new Hydra();
		Larva l03 = new Multal();
		l01.attack();l01.move();
		l02.attack();l02.move();
		l03.attack();l03.move();
		*/
		//Player(선수와 정보)분류,팀 , train()공통 play():재정의(추상)
		// ==>BaseballPlayer ,SoccerPlayer 
		ArrayList<Player> players = new ArrayList<Player>
		//Player p1 = new BasePlayer()
		players.add(new BasePlayer("김태진"));
		players.add(new BasePlayer("이대호"));
		players.add(new SoccerPlayer("손흥민"));
		for(Player p1:players) {
			//공통메서드와 다양한 재정의하는 기능을 처리.. 
			p1.trainning(); p1.play();
	}
		BestPlayer3 bp = new BestPlayer3(9);
		bp.setPlist(new BasePlayer("이대호"));
		bp.setPlist(new BasePlayer("김태진"));
		bp.setPlist(new SoccerPlayer("손흥민"));
		bp.showList();
}
}
class BestPlayer3{
	private int month; //월
	private ArrayList<Player> plist;
	public BestPlayer3(int month) {
		this.month = month;
		this.plist = new ArrayList<Player>();
	}
	public void setPlist(Player player) {
		this.plist.add(player);
	}
	public void showList() {
		System.out.println(month+"월 Best Player");
		int no =0;
		for(Player p:plist) {
			System.out.println(++no+" ");
			System.out.println(p.getKind()+" "+p.getName());
			p.play();			
		}
	}
}
abstract class Comp{
	public void working() {
		System.out.println("일을 열심히 합니다");
	}
	public abstract void earnMoney();//어떻게 버는지 하위클래스에 반드시 재정의
}
	
class Samsung01 extends Comp{
	//상속하는 상위에 있는 추상 메서드 earnMoney를 반드시 재정의 
	@Override
	public void earnMoney() {
		// TODO Auto-generated method stub
		System.out.println("전자제품을 만들어서 돈을 번다.");
	}
	

		/*
		 #추상 클래스 (Abstract Class)
	 1. 개념 
		1) 실체들 간의 공통되는 특성을 추출한 것
		 ex1) 새 , 곤충, 물고기 ==> 동물 (추상)
		 ex2) 삼성, 현대, LG ==> 회사(추상)
		2) 자바의 추상?
		 실제 클래스들의 공통되는 필드와 메소드 정의한 클래스
		 추상 클래스는 실체 클래스의 부모 클래스 역할 (단독으로 객체 생성을 하지 못한다)
	 	cf) 실체 클래스 : 객체를 만들어 사용할 수 있는 클래스
		Animal.class (추상 클래스) - 공통메서드, 추상 메서드
			(상속)
	
		 Bird.class Insect.class Fish.class (실제클래스)
	2.추상 클래스의 용도
		1) 실체 클래스의 공통된 필드와 메소드의 이름을 통일할 목적
		 - 실체 클래스를 설계자가 여러 사람일 경우,
		 - 실체 클래스마다 필드와 메소드가 제각기 다른 이름을 가질 수 있음
		2) 실체 클래스를 작성할때, 시간 절약
		 - 실체 클래스는 추가적인 필드와 메소드만 선언
		3) 실체 클래스 설계 규격을 만들고자 할 때
	 	 - 실체 클래스가 가져야할 필드와 메소드를 추상 클래스에 미리 정의
	 	 - 실체 클래스는 추상 클래스를 무조건 상속 받아 작성
		 */

//애벌레 ==> 실제 객체 
abstract class Player{
	private String train;
	public Player(String train) {
		this.train = train;
	}
	public void trainning();
		System.out.println(this.train+"운동을 한다")
public String getTrain() {
		return train;
	}

	public void setTrain(String train) {
		this.train = train;
	}

public Player(String train) {
		this.train = train;
	}

abstract class Larva{
	private String kind;
	public Larva(String kind) {
		this.kind = kind;
	}
	//공통 메서드
	public void move() {
		System.out.println(this.kind+" 이동하다");
	}
	public String getKind() {
		return kind;
	}
	//추상메서드 
	public abstract void attack();
}

class Zergglng extends Larva{
	public Zergglng() {
		super("저글링");
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+" 빠른 근접 공격을 한다.");
	}
}
class Hydra extends Larva{
	public Hydra() {
		super("히드라리스크");
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+" 원거리 강한 공격을 한다.");
	}
}
class Multal extends Larva{
	public Multal() {
		super("뮤탈리스트");
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+" 원거리 공중 공격(공대지/공대공)을 한다.");
	}
}
}
}
	