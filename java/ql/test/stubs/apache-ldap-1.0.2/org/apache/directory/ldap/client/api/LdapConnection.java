package org.apache.directory.ldap.client.api;

import org.apache.directory.api.ldap.model.exception.LdapException;
import org.apache.directory.api.ldap.model.cursor.EntryCursor;
import org.apache.directory.api.ldap.model.cursor.SearchCursor;
import org.apache.directory.api.ldap.model.message.SearchRequest;
import org.apache.directory.api.ldap.model.message.SearchScope;
import org.apache.directory.api.ldap.model.name.Dn;

public interface LdapConnection {
  SearchCursor search(SearchRequest searchRequest) throws LdapException;

  EntryCursor search(String baseDn, String filter, SearchScope scope, String... attributes) throws LdapException;

  EntryCursor search(Dn baseDn, String filter, SearchScope scope, String... attributes) throws LdapException;

}
