/* OSCATS: Open-Source Computerized Adaptive Testing System
 * Exposure Counter Algorithm Java Wrapper Class
 * Copyright 2010 Michael Culbertson <culbert1@illinois.edu>
 *
 *  OSCATS is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  OSCATS is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with OSCATS.  If not, see <http://www.gnu.org/licenses/>.
 */

package oscats;

import oscats.bindings.BlacklistedMethodError;
import oscats.bindings.FIXME;
import oscats.glib.Object;

public final class AlgExposureCounter extends Algorithm
{
    protected AlgExposureCounter(long pointer) { super(pointer); }

    public AlgExposureCounter() { this(OscatsAlgExposureCounter.new_with_params()); }

    public int numExaminees() {
      return OscatsAlgExposureCounter.numExaminees(this);
    }
    
    public double getRate(Item item) {
      return OscatsAlgExposureCounter.getRate(this, item);
    }

}

