package es6;
public class es6 {
	public static void main(String[] args) {
		Rettangolo r = new Rettangolo("Rettangolo", (int)Math.round(Math.random()*10+1), (int)Math.round(Math.random()*10+1));
		System.out.println(r.toString());
		System.out.println("");
		Cerchio c = new Cerchio("Cerchio", (int)Math.round(Math.random()*10+1));
		System.out.println(c.toString());
		System.out.println("");
		Quadrato q = new Quadrato("Quadrato", (int)Math.round(Math.random()*10+1));
		System.out.println(q.toString());
		System.out.println("");
		Ellisse e = new Ellisse("Ellisse", (int)Math.round(Math.random()*10+1), (int)Math.round(Math.random()*10+1));
		System.out.println(e.toString());
		System.out.println("");
		Triangolo t = new Triangolo("Triangolo", (int)Math.round(Math.random()*10+1), (int)Math.round(Math.random()*10+1));
		System.out.println(t.toString());
		System.out.println("");
		System.out.println("La figura più grande è: ");
		FiguraGeometrica[] figure = {r, c, q, e, t};
		System.out.println(massimo(figure).toString());
	}
	static Confrontabile massimo(Confrontabile[] c) {
		Confrontabile max = c[0];
		for(int i=0; i<c.length; i++) {
			if(c[i].maggiore(max)) {
				max = c[i];
			}
		}
		return max;
	}
}

interface Confrontabile {
	boolean maggiore(Confrontabile c);
}

abstract class FiguraGeometrica implements Confrontabile {
	String descrizione;
	double area() {return 0;}
	double perimetro() {return 0;}
	@Override
	public String toString() {return "";}
	@Override
	public boolean maggiore(Confrontabile c) {
		if(this.area() > ((FiguraGeometrica) c).area())
			return true;
		else
			return false;
	}
}

class Rettangolo extends FiguraGeometrica implements Confrontabile {
	int base, altezza;
	public Rettangolo(String descrizione, int base, int altezza) {
		this.descrizione = descrizione;
		this.base = base;
		this.altezza = altezza;
	}
	@Override
	double area() {
		return base*altezza;
	}
	@Override
	double perimetro() {
		return 2*(base+altezza);
	}
	@Override
	public String toString() {
		return "Descrizione: "+this.descrizione+"\nBase: "+this.base+"\nAltezza: "+this.altezza+"\nArea: "+this.area()+"\nPerimetro: "+this.perimetro();
	}
}

class Quadrato extends FiguraGeometrica implements Confrontabile {
	int lato;
	public Quadrato(String descrizione, int lato) {
		this.descrizione = descrizione;
		this.lato = lato;
	}
	@Override
	double area() {
		return lato*lato;
	}
	@Override
	double perimetro() {
		return 4*lato;
	}
	@Override
	public String toString() {
		return "Descrizione: "+this.descrizione+"\nLato: "+this.lato+"\nArea: "+this.area()+"\nPerimetro: "+this.perimetro();
	}
}

class Cerchio extends FiguraGeometrica implements Confrontabile {
	int raggio;
	public Cerchio(String descrizione, int raggio) {
		this.descrizione = descrizione;
		this.raggio = raggio;
	}
	@Override
	double area() {
		return Math.PI*raggio*raggio;
	}
	@Override
	double perimetro() {
		return 2*Math.PI*raggio;
	}
	@Override
	public String toString() {
		return "Descrizione: "+this.descrizione+"\nRaggio: "+this.raggio+"\nArea: "+this.area()+"\nPerimetro: "+this.perimetro();
	}
}

class Ellisse extends FiguraGeometrica implements Confrontabile {
	int semiasse_maggiore, semiasse_minore;
	public Ellisse(String descrizione, int semiasse_maggiore, int semiasse_minore) {
		this.descrizione = descrizione;
		this.semiasse_maggiore = semiasse_maggiore;
		this.semiasse_minore = semiasse_minore;
	}
	@Override
	double area() {
		return Math.PI*semiasse_maggiore*semiasse_minore;
	}
	@Override
	double perimetro() {
		return Math.PI*Math.sqrt(2)*semiasse_maggiore*semiasse_maggiore*semiasse_minore*semiasse_minore;
	}
	@Override
	public String toString() {
		return "Descrizione: "+this.descrizione+"\nSemiasse maggiore: "+this.semiasse_maggiore+"\nSemiasse minore: "+this.semiasse_minore+"\nArea: "+this.area()+"\nPerimetro: "+this.perimetro();
	}
}

class Triangolo extends FiguraGeometrica implements Confrontabile {
	int base, altezza;
	public Triangolo(String descrizione, int base, int altezza) {
		this.descrizione = descrizione;
		this.base = base;
		this.altezza = altezza;
	}
	@Override
	double area() {
		return (base*altezza)/2;
	}
	@Override
	double perimetro() {
		return base+(Math.sqrt((base*base)+(altezza*altezza)))*2;
	}
	@Override
	public String toString() {
		return "Descrizione: "+this.descrizione+"\nBase: "+this.base+"\nAltezza: "+this.altezza+"\nArea: "+this.area()+"\nPerimetro: "+this.perimetro();
	}
}