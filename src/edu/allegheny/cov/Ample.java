package edu.allegheny.cov;

public class Ample implements REFunction {
	public double analyze( int aef, int aep, int anf, int anp ) {
		return ( (double) aef / ( aef + anf ) )
			 - ( (double) aep / ( aep + anp ) );
	}

	public String toString() {
		return "Ample";
	}
}
;