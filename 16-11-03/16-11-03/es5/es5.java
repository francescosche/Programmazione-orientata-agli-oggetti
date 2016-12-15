package es5;

public class es5 {
	public static void main(String[] args) {
		Rettangolo r = new Rettangolo("Rettangolo", 10, 5);
		r.stampa();
		System.out.println("");
		Cerchio c = new Cerchio("Cerchio", 6);
		c.stampa();
		System.out.println("");
		Quadrato q = new Quadrato("Quadrato", 6);
		q.stampa();
		System.out.println("");
		Ellisse e = new Ellisse("Ellisse", 10, 5);
		e.stampa();
		System.out.println("");
		Triangolo t = new Triangolo("Triangolo", 10, 5);
		t.stampa();
		System.out.println("");
		FiguraGeometrica[] figure = {r, c, q, e, t};
		System.out.println("La somma delle loro aree è: "+SommaAree(figure));
	}
	static double SommaAree(FiguraGeometrica[] figure) {
		int numero_figure = figure.length;
		double somma = 0;
		for(int i=0; i<numero_figure; i++) {
			somma += figure[i].area();
		}
		return somma;
	}
}

class FiguraGeometrica {
	String descrizione;
	double area() {return 0;}
	double perimetro() {return 0;}
	void stampa() {}
}

class Rettangolo extends FiguraGeometrica {
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
	void stampa() {
		System.out.println("Descrizione: "+this.descrizione);
		System.out.println("Base: "+this.base);
		System.out.println("Altezza: "+this.altezza);
		System.out.println("Area: "+this.area());
		System.out.println("Perimetro: "+this.perimetro());
	}
}

class Quadrato extends FiguraGeometrica {
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
	void stampa() {
		System.out.println("Descrizione: "+this.descrizione);
		System.out.println("Lato: "+this.lato);
		System.out.println("Area: "+this.area());
		System.out.println("Perimetro: "+this.perimetro());
	}
}

class Cerchio extends FiguraGeometrica {
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
	void stampa() {
		System.out.println("Descrizione: "+this.descrizione);
		System.out.println("Raggio: "+this.raggio);
		System.out.println("Area: "+this.area());
		System.out.println("Perimetro: "+this.perimetro());
	}
}

class Ellisse extends FiguraGeometrica {
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
	void stampa() {
		System.out.println("Descrizione: "+this.descrizione);
		System.out.println("Semiasse maggiore: "+this.semiasse_maggiore);
		System.out.println("Semiasse minore: "+this.semiasse_minore);
		System.out.println("Area: "+this.area());
		System.out.println("Perimetro: "+this.perimetro());
	}
}

class Triangolo extends FiguraGeometrica {
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
	void stampa() {
		System.out.println("Descrizione: "+this.descrizione);
		System.out.println("Base: "+this.base);
		System.out.println("Altezza: "+this.altezza);
		System.out.println("Area: "+this.area());
		System.out.println("Perimetro: "+this.perimetro());
	}
}