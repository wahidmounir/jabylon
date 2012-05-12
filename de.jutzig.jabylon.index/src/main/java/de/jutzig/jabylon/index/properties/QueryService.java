/**
 * 
 */
package de.jutzig.jabylon.index.properties;

import org.apache.lucene.search.Query;


/**
 * @author Johannes Utzig (jutzig.dev@googlemail.com)
 *
 */
public interface QueryService {
	
	String FIELD_VALUE = "value";
	String FIELD_KEY = "key";
	String FIELD_URI = "uri";
	String FIELD_COMMENT = "comment";
	String FIELD_LOCALE = "locale";
	String FIELD_VERSION = "version";
	String FIELD_PROJECT = "project";
	String FIELD_CDO_ID = "cdoID";
	String MASTER = "master";
	
	
	SearchResult search(String search, Object scope);
	
	SearchResult search(Query query);

}
