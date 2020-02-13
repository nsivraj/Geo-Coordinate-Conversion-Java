package com.berico.coords;


import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.coords.UTMCoord;

public class Example
{
    public static void main( String[] args )
    {	
//    		String mgrs = Coordinates.mgrsFromLatLon(37.10, -112.12);
//
//    		System.out.println(mgrs);
//
//    		double[] latLon = Coordinates.latLonFromMgrs(mgrs);

		UTMCoord utm = UTMCoord.fromLatLon(Angle.fromDegrees(55.4572156707414D), Angle.fromDegrees(-129.47636882408398));
    		System.out.println(
    			String.format("%s", utm));
    }
}
