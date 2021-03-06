/*
 *  Copyright 2019 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package guru.sfg.brewery.web.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeerDtoPagedListTest {

    @Test
    void testBeerPage() {
        //given
        List<BeerDto> beers = new ArrayList<>(2);
        beers.add(BeerDto.builder().id(UUID.randomUUID()).build());
        beers.add(BeerDto.builder().id(UUID.randomUUID()).build());

        //when
        BeerPagedList pagedList = new BeerPagedList(beers);

        //then
        assertEquals(2, pagedList.getContent().size());
    }
}