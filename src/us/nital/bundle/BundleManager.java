/*
 * Nital is an effort to provide a well documented, powerful, scalable, and robust 
 * RuneScape server framework delivered open-source to all users.
 *
 *  Copyright (C) 2011 Nital Software
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package us.nital.bundle;

/**
 * Manages the bundles.
 * @author Thomas Nappo
 */
public final class BundleManager {

	/**
	 * The singleton instance of the bundle manager.
	 */
	private static final BundleManager INSTANCE = new BundleManager();

	/**
	 * Gets the singleton instance of the bundle manager.
	 * @return The one and only instance of the bundle manager.
	 */
	public static BundleManager getSingleton() {
		return INSTANCE;
	}

}