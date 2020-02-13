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

		//UTMCoord utm = UTMCoord.fromLatLon(Angle.fromDegrees(-64.24132515751064D), Angle.fromDegrees(-63.339247243762756D));
        UTMCoord utm = UTMCoord.fromLatLon(Angle.fromDegrees(-64.24132515856515D), Angle.fromDegrees(-63.33924724341925D));
    		System.out.println(
    			String.format("%s", utm));
    }
}
