/*
 *-------------------------------------------------------------------
 * Copyright (c)2017 Jeppesen
 * All Rights Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE.
 * -------------------------------------------------------------------
*/
package com.market.demo.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Constants {

	private Constants() {
	}

	public static final String STR_EMPTY = "";
	public static final String STR_CIC_TYPE = "CO";
	public static final String STR_COMMA = ",";
	public static final String STR_CHART = "Charts";
	public static final String STR_PUBLISHING = "Insert Charts";

	public static final String LOGIN_ERR_MSG_1 = "Login error. Please try again. If the problem persists,  contact your Ground Controls Administrator.";
	public static final String LOGIN_ERR_MSG_2 = "Cannot connect to the server. Please try again. If the problem persists,  contact Jeppesen Support.";
	public static final String LOGIN_ERR_MSG_3 = "You do not have permission to access Ground Controls. Contact your Ground Controls Administrator.";

	public static final String GC_ROLES_CIC = "Insert Charts";
	public static final String GC_ROLES_CHART = "Charts";
	public static final String ELINK_ROLES_CHART_VIEW = "services.chartviewer.access";
	public static final String ELINK_ROLES_TCL_VIEW = "content.tcl.view";

	// Type of default settings information associated with the user
	public static final String DEFAULT_SETTINGS_AIRPORT = "TYPE_AIRPORT";
	public static final String DEFAULT_SETTINGS_COVERAGES = "TYPE_COVERAGES";
	public static final String DEFAULT_SETTINGS_CIC = "TYPE_CIC";

	public static final String VIRUS_SCANNER_ON_TRUE = "true";
	public static final String VIRUS_SCANNER_ON_FALSE = "false";

	public static class DateFormat {
		private DateFormat() {
		}

		public static final String ROUND_TRIP = "yyyy-MM-dd HH:mm:ssZ";
		public static final String DAY_MONTH_YEAR = "dd MMM yyyy";
	}

	public static final String TIMEZONE_UTC = "UTC";

	protected static Map<String, String[]> chartTypeMap = new HashMap<>();
	public static final Map<String, String[]> CHART_TYPE_MAP = Collections.unmodifiableMap(chartTypeMap);

	static {
		chartTypeMap.put("STAR", new String[] { "ARRIVAL" });
		chartTypeMap.put("REF", new String[] { "AIRSPACE", "NOISE" });
		chartTypeMap.put("SID", new String[] { "DEPARTURE" });
		chartTypeMap.put("TAXI", new String[] { "AIRPORT" });
		chartTypeMap.put("APP", new String[] { "APPROACH" });
	}

	public static final String ZOOM_IMAGE_TERMINAL_CHART_15 = "15";

	public static class PublishingJob {

		public static String ENABLE_STATUS = "0";

		public static String DISABLE_STATUS = "1";
	}

	public static class Chart {

		private Chart() {
		}

		public static class Status {

			private Status() {
			}

			public static Integer PENDING_TO_PUBLISH = 0;
			public static Integer DELETED = 1;
			public static Integer TO_BE_DELETED = 2;
		}
	}

	public static class ChartEffectivity {

		private ChartEffectivity() {
		}

		public static class Type {

			private Type() {
			}

			public static String DELETE = "Delete";
		}
	}

	public interface Roles {
		String CHARTS = "Charts";
		String INSERT_CHARTS = "Insert Charts";
		String ADMIN = "Administrator";
		String TKOD = "Trip Kit on Demand";
		String TEDM = "Tailored Enroute Data Manager";
	}
}
