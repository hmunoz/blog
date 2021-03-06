/*
 *	Copyright 2005 stat4j.org
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package net.sourceforge.stat4j.calculators;

import net.sourceforge.stat4j.Metric;

/**
 * Name:		RunningTotal.java
 * Date:		Aug 30, 2004
 * Description:
 * 
 * 
 * @author Lara D'Abreo
 */
public class MaxCount extends Maximum {

	
	protected double	count;
	
	public MaxCount() {
		reset();
		setApplyImmediatePreset(true);
		setApplyImmediate(true);
	}

	public void applyMetric(Metric metric) {
		
		if (metric.getFirstReading() != null) {
			count = count + 1;
		}else {
			count = count -1;
		}
		applyMaximum(count,metric.getTimestamp());

	}
	
	public void reset() {
		super.reset();
		count = 0.0;
	}

	
}
