/*
 * Copyright 2014-2015 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.schildbach.pte.live;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import de.schildbach.pte.ItalyProvider;

/**
 * @author Antonio El Khoury
 */
public class ItalyProviderLiveTest extends AbstractNavitiaProviderLiveTest
{
	public ItalyProviderLiveTest()
	{
		super(new ItalyProvider(Secrets.NAVITIA_AUTHORIZATION));
	}

	@Test
	public void nearbyStationsAddress() throws Exception
	{
		nearbyStationsAddress(38143607, 13336346);
	}

	@Test
	public void nearbyStationsStation() throws Exception
	{
		nearbyStationsStation("APOLLO - AGLAIA");
	}

	@Test
	public void nearbyStationsPoi() throws Exception
	{
		nearbyStationsPoi("Fontana di Trevi");
	}

	@Test
	public void nearbyStationsAny() throws Exception
	{
		nearbyStationsAny(38096070, 13400204);
	}

	@Test
	public void queryDeparturesEquivsFalseRome() throws Exception
	{
		queryDeparturesEquivsFalse("stop_point:ORA:SP:AD10");
	}

	@Test
	public void queryDeparturesStopAreaRome() throws Exception
	{
		queryDeparturesStopArea("stop_area:ORA:SA:50003");
	}

	@Test
	public void queryDeparturesEquivsTrueRome() throws Exception
	{
		queryDeparturesEquivsTrue("stop_point:ORA:SP:AD10");
	}

	@Test
	public void queryDeparturesInvalidStation() throws Exception
	{
		queryDeparturesInvalidStation("stop_point:RTP:SP:999999");
	}

	@Test
	public void suggestLocations() throws Exception
	{
		suggestLocationsFromName("fontana trevi");
	}

	@Test
	public void suggestLocationsFromAddress() throws Exception
	{
		suggestLocationsFromAddress("12 via ferrata");
	}

	@Test
	public void suggestLocationsNoLocation() throws Exception
	{
		suggestLocationsNoLocation("bellevilleadasdjkaskd");
	}

	@Test
	public void queryTripAddressesRome() throws Exception
	{
		queryTrip("Via Anton Giulio Barrili, 44-46, Roma", "Via delle Cave di Pietralata, 103, Roma");
	}

	@Test
	public void queryTripAddressStationRome() throws Exception
	{
		queryTrip("Via Anton Giulio Barrili, 44-46, Roma", "Policlinico");
	}

	@Test
	public void queryTripStationsRome() throws Exception
	{
		queryTrip("Ottaviano", "Policlinico");
	}

	@Test
	public void queryTripNoSolution() throws Exception
	{
		queryTripNoSolution("Palermo Centrale", "Galletti Zita");
	}

	@Test
	public void queryTripUnknownFrom() throws Exception
	{
		queryTripUnknownFrom("Palermo Centrale");
	}

	@Test
	public void queryTripUnknownTo() throws Exception
	{
		queryTripUnknownTo("Palermo Centrale");
	}

	@Test
	public void queryTripSlowWalkRome() throws Exception
	{
		queryTripSlowWalk("Ottaviano", "Policlinico");
	}

	@Test
	public void queryTripFastWalkRome() throws Exception
	{
		queryTripFastWalk("Ottaviano", "Policlinico");
	}

	@Test
	public void queryMoreTripsRome() throws Exception
	{
		queryMoreTrips("Ottaviano", "Policlinico");
	}
}
