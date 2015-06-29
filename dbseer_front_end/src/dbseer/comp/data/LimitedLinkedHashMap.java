/*
 * Copyright 2013 Barzan Mozafari
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dbseer.comp.data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by dyoon on 15. 1. 4..
 */
public class LimitedLinkedHashMap<K, V> extends LinkedHashMap<K, V>
{
	private final int maxSize;

	public LimitedLinkedHashMap(int size)
	{
		this.maxSize = size;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> entry)
	{
		return size() > maxSize;
	}
}
