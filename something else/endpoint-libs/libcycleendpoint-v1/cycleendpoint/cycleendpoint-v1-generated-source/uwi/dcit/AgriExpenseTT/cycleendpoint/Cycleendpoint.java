/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-09 17:08:39 UTC)
 * on 2014-07-21 at 20:32:58 UTC 
 * Modify at your own risk.
 */

package uwi.dcit.AgriExpenseTT.cycleendpoint;

/**
 * Service definition for Cycleendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CycleendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Cycleendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the cycleendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myapp.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "cycleendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Cycleendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Cycleendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getCycle".
   *
   * This request holds the parameters needed by the the cycleendpoint server.  After setting any
   * optional parameters, call the {@link GetCycle#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetCycle getCycle(java.lang.String id) throws java.io.IOException {
    GetCycle result = new GetCycle(id);
    initialize(result);
    return result;
  }

  public class GetCycle extends CycleendpointRequest<uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle> {

    private static final String REST_PATH = "cycle/{id}";

    /**
     * Create a request for the method "getCycle".
     *
     * This request holds the parameters needed by the the cycleendpoint server.  After setting any
     * optional parameters, call the {@link GetCycle#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetCycle#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetCycle(java.lang.String id) {
      super(Cycleendpoint.this, "GET", REST_PATH, null, uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetCycle setAlt(java.lang.String alt) {
      return (GetCycle) super.setAlt(alt);
    }

    @Override
    public GetCycle setFields(java.lang.String fields) {
      return (GetCycle) super.setFields(fields);
    }

    @Override
    public GetCycle setKey(java.lang.String key) {
      return (GetCycle) super.setKey(key);
    }

    @Override
    public GetCycle setOauthToken(java.lang.String oauthToken) {
      return (GetCycle) super.setOauthToken(oauthToken);
    }

    @Override
    public GetCycle setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetCycle) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetCycle setQuotaUser(java.lang.String quotaUser) {
      return (GetCycle) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetCycle setUserIp(java.lang.String userIp) {
      return (GetCycle) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetCycle setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetCycle set(String parameterName, Object value) {
      return (GetCycle) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertCycle".
   *
   * This request holds the parameters needed by the the cycleendpoint server.  After setting any
   * optional parameters, call the {@link InsertCycle#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle}
   * @return the request
   */
  public InsertCycle insertCycle(uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle content) throws java.io.IOException {
    InsertCycle result = new InsertCycle(content);
    initialize(result);
    return result;
  }

  public class InsertCycle extends CycleendpointRequest<uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle> {

    private static final String REST_PATH = "cycle";

    /**
     * Create a request for the method "insertCycle".
     *
     * This request holds the parameters needed by the the cycleendpoint server.  After setting any
     * optional parameters, call the {@link InsertCycle#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertCycle#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle}
     * @since 1.13
     */
    protected InsertCycle(uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle content) {
      super(Cycleendpoint.this, "POST", REST_PATH, content, uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle.class);
    }

    @Override
    public InsertCycle setAlt(java.lang.String alt) {
      return (InsertCycle) super.setAlt(alt);
    }

    @Override
    public InsertCycle setFields(java.lang.String fields) {
      return (InsertCycle) super.setFields(fields);
    }

    @Override
    public InsertCycle setKey(java.lang.String key) {
      return (InsertCycle) super.setKey(key);
    }

    @Override
    public InsertCycle setOauthToken(java.lang.String oauthToken) {
      return (InsertCycle) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertCycle setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertCycle) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertCycle setQuotaUser(java.lang.String quotaUser) {
      return (InsertCycle) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertCycle setUserIp(java.lang.String userIp) {
      return (InsertCycle) super.setUserIp(userIp);
    }

    @Override
    public InsertCycle set(String parameterName, Object value) {
      return (InsertCycle) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listCycle".
   *
   * This request holds the parameters needed by the the cycleendpoint server.  After setting any
   * optional parameters, call the {@link ListCycle#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListCycle listCycle() throws java.io.IOException {
    ListCycle result = new ListCycle();
    initialize(result);
    return result;
  }

  public class ListCycle extends CycleendpointRequest<uwi.dcit.AgriExpenseTT.cycleendpoint.model.CollectionResponseCycle> {

    private static final String REST_PATH = "cycle";

    /**
     * Create a request for the method "listCycle".
     *
     * This request holds the parameters needed by the the cycleendpoint server.  After setting any
     * optional parameters, call the {@link ListCycle#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListCycle#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListCycle() {
      super(Cycleendpoint.this, "GET", REST_PATH, null, uwi.dcit.AgriExpenseTT.cycleendpoint.model.CollectionResponseCycle.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListCycle setAlt(java.lang.String alt) {
      return (ListCycle) super.setAlt(alt);
    }

    @Override
    public ListCycle setFields(java.lang.String fields) {
      return (ListCycle) super.setFields(fields);
    }

    @Override
    public ListCycle setKey(java.lang.String key) {
      return (ListCycle) super.setKey(key);
    }

    @Override
    public ListCycle setOauthToken(java.lang.String oauthToken) {
      return (ListCycle) super.setOauthToken(oauthToken);
    }

    @Override
    public ListCycle setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListCycle) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListCycle setQuotaUser(java.lang.String quotaUser) {
      return (ListCycle) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListCycle setUserIp(java.lang.String userIp) {
      return (ListCycle) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListCycle setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListCycle setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListCycle set(String parameterName, Object value) {
      return (ListCycle) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeCycle".
   *
   * This request holds the parameters needed by the the cycleendpoint server.  After setting any
   * optional parameters, call the {@link RemoveCycle#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveCycle removeCycle(java.lang.String id) throws java.io.IOException {
    RemoveCycle result = new RemoveCycle(id);
    initialize(result);
    return result;
  }

  public class RemoveCycle extends CycleendpointRequest<Void> {

    private static final String REST_PATH = "cycle/{id}";

    /**
     * Create a request for the method "removeCycle".
     *
     * This request holds the parameters needed by the the cycleendpoint server.  After setting any
     * optional parameters, call the {@link RemoveCycle#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveCycle#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveCycle(java.lang.String id) {
      super(Cycleendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveCycle setAlt(java.lang.String alt) {
      return (RemoveCycle) super.setAlt(alt);
    }

    @Override
    public RemoveCycle setFields(java.lang.String fields) {
      return (RemoveCycle) super.setFields(fields);
    }

    @Override
    public RemoveCycle setKey(java.lang.String key) {
      return (RemoveCycle) super.setKey(key);
    }

    @Override
    public RemoveCycle setOauthToken(java.lang.String oauthToken) {
      return (RemoveCycle) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveCycle setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveCycle) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveCycle setQuotaUser(java.lang.String quotaUser) {
      return (RemoveCycle) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveCycle setUserIp(java.lang.String userIp) {
      return (RemoveCycle) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveCycle setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveCycle set(String parameterName, Object value) {
      return (RemoveCycle) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateCycle".
   *
   * This request holds the parameters needed by the the cycleendpoint server.  After setting any
   * optional parameters, call the {@link UpdateCycle#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle}
   * @return the request
   */
  public UpdateCycle updateCycle(uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle content) throws java.io.IOException {
    UpdateCycle result = new UpdateCycle(content);
    initialize(result);
    return result;
  }

  public class UpdateCycle extends CycleendpointRequest<uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle> {

    private static final String REST_PATH = "cycle";

    /**
     * Create a request for the method "updateCycle".
     *
     * This request holds the parameters needed by the the cycleendpoint server.  After setting any
     * optional parameters, call the {@link UpdateCycle#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateCycle#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle}
     * @since 1.13
     */
    protected UpdateCycle(uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle content) {
      super(Cycleendpoint.this, "PUT", REST_PATH, content, uwi.dcit.AgriExpenseTT.cycleendpoint.model.Cycle.class);
    }

    @Override
    public UpdateCycle setAlt(java.lang.String alt) {
      return (UpdateCycle) super.setAlt(alt);
    }

    @Override
    public UpdateCycle setFields(java.lang.String fields) {
      return (UpdateCycle) super.setFields(fields);
    }

    @Override
    public UpdateCycle setKey(java.lang.String key) {
      return (UpdateCycle) super.setKey(key);
    }

    @Override
    public UpdateCycle setOauthToken(java.lang.String oauthToken) {
      return (UpdateCycle) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateCycle setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateCycle) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateCycle setQuotaUser(java.lang.String quotaUser) {
      return (UpdateCycle) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateCycle setUserIp(java.lang.String userIp) {
      return (UpdateCycle) super.setUserIp(userIp);
    }

    @Override
    public UpdateCycle set(String parameterName, Object value) {
      return (UpdateCycle) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Cycleendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Cycleendpoint}. */
    @Override
    public Cycleendpoint build() {
      return new Cycleendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link CycleendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCycleendpointRequestInitializer(
        CycleendpointRequestInitializer cycleendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cycleendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
