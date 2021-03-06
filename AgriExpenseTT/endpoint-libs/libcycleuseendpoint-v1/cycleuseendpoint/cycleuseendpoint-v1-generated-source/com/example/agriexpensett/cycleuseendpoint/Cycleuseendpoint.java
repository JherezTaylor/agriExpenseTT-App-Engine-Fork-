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
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-08-17 at 00:59:08 UTC 
 * Modify at your own risk.
 */

package com.example.agriexpensett.cycleuseendpoint;

/**
 * Service definition for Cycleuseendpoint (v1).
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
 * This service uses {@link CycleuseendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Cycleuseendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the cycleuseendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://thematic-ruler-633.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "cycleuseendpoint/v1/";

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
  public Cycleuseendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Cycleuseendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "deleteAll".
   *
   * This request holds the parameters needed by the cycleuseendpoint server.  After setting any
   * optional parameters, call the {@link DeleteAll#execute()} method to invoke the remote operation.
   *
   * @param namespace
   * @return the request
   */
  public DeleteAll deleteAll(java.lang.String namespace) throws java.io.IOException {
    DeleteAll result = new DeleteAll(namespace);
    initialize(result);
    return result;
  }

  public class DeleteAll extends CycleuseendpointRequest<Void> {

    private static final String REST_PATH = "all/{namespace}";

    /**
     * Create a request for the method "deleteAll".
     *
     * This request holds the parameters needed by the the cycleuseendpoint server.  After setting any
     * optional parameters, call the {@link DeleteAll#execute()} method to invoke the remote
     * operation. <p> {@link
     * DeleteAll#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param namespace
     * @since 1.13
     */
    protected DeleteAll(java.lang.String namespace) {
      super(Cycleuseendpoint.this, "GET", REST_PATH, null, Void.class);
      this.namespace = com.google.api.client.util.Preconditions.checkNotNull(namespace, "Required parameter namespace must be specified.");
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
    public DeleteAll setAlt(java.lang.String alt) {
      return (DeleteAll) super.setAlt(alt);
    }

    @Override
    public DeleteAll setFields(java.lang.String fields) {
      return (DeleteAll) super.setFields(fields);
    }

    @Override
    public DeleteAll setKey(java.lang.String key) {
      return (DeleteAll) super.setKey(key);
    }

    @Override
    public DeleteAll setOauthToken(java.lang.String oauthToken) {
      return (DeleteAll) super.setOauthToken(oauthToken);
    }

    @Override
    public DeleteAll setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeleteAll) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeleteAll setQuotaUser(java.lang.String quotaUser) {
      return (DeleteAll) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeleteAll setUserIp(java.lang.String userIp) {
      return (DeleteAll) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String namespace;

    /**

     */
    public java.lang.String getNamespace() {
      return namespace;
    }

    public DeleteAll setNamespace(java.lang.String namespace) {
      this.namespace = namespace;
      return this;
    }

    @Override
    public DeleteAll set(String parameterName, Object value) {
      return (DeleteAll) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getAllCycleUse".
   *
   * This request holds the parameters needed by the cycleuseendpoint server.  After setting any
   * optional parameters, call the {@link GetAllCycleUse#execute()} method to invoke the remote
   * operation.
   *
   * @param namespace
   * @return the request
   */
  public GetAllCycleUse getAllCycleUse(java.lang.String namespace) throws java.io.IOException {
    GetAllCycleUse result = new GetAllCycleUse(namespace);
    initialize(result);
    return result;
  }

  public class GetAllCycleUse extends CycleuseendpointRequest<com.example.agriexpensett.cycleuseendpoint.model.CycleUseCollection> {

    private static final String REST_PATH = "cycleusecollection/{namespace}";

    /**
     * Create a request for the method "getAllCycleUse".
     *
     * This request holds the parameters needed by the the cycleuseendpoint server.  After setting any
     * optional parameters, call the {@link GetAllCycleUse#execute()} method to invoke the remote
     * operation. <p> {@link GetAllCycleUse#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param namespace
     * @since 1.13
     */
    protected GetAllCycleUse(java.lang.String namespace) {
      super(Cycleuseendpoint.this, "GET", REST_PATH, null, com.example.agriexpensett.cycleuseendpoint.model.CycleUseCollection.class);
      this.namespace = com.google.api.client.util.Preconditions.checkNotNull(namespace, "Required parameter namespace must be specified.");
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
    public GetAllCycleUse setAlt(java.lang.String alt) {
      return (GetAllCycleUse) super.setAlt(alt);
    }

    @Override
    public GetAllCycleUse setFields(java.lang.String fields) {
      return (GetAllCycleUse) super.setFields(fields);
    }

    @Override
    public GetAllCycleUse setKey(java.lang.String key) {
      return (GetAllCycleUse) super.setKey(key);
    }

    @Override
    public GetAllCycleUse setOauthToken(java.lang.String oauthToken) {
      return (GetAllCycleUse) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAllCycleUse setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAllCycleUse) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAllCycleUse setQuotaUser(java.lang.String quotaUser) {
      return (GetAllCycleUse) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAllCycleUse setUserIp(java.lang.String userIp) {
      return (GetAllCycleUse) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String namespace;

    /**

     */
    public java.lang.String getNamespace() {
      return namespace;
    }

    public GetAllCycleUse setNamespace(java.lang.String namespace) {
      this.namespace = namespace;
      return this;
    }

    @Override
    public GetAllCycleUse set(String parameterName, Object value) {
      return (GetAllCycleUse) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getCycleUse".
   *
   * This request holds the parameters needed by the cycleuseendpoint server.  After setting any
   * optional parameters, call the {@link GetCycleUse#execute()} method to invoke the remote
   * operation.
   *
   * @param namespace
   * @param keyrep
   * @return the request
   */
  public GetCycleUse getCycleUse(java.lang.String namespace, java.lang.String keyrep) throws java.io.IOException {
    GetCycleUse result = new GetCycleUse(namespace, keyrep);
    initialize(result);
    return result;
  }

  public class GetCycleUse extends CycleuseendpointRequest<com.example.agriexpensett.cycleuseendpoint.model.CycleUse> {

    private static final String REST_PATH = "cycleuse/{namespace}/{keyrep}";

    /**
     * Create a request for the method "getCycleUse".
     *
     * This request holds the parameters needed by the the cycleuseendpoint server.  After setting any
     * optional parameters, call the {@link GetCycleUse#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetCycleUse#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param namespace
     * @param keyrep
     * @since 1.13
     */
    protected GetCycleUse(java.lang.String namespace, java.lang.String keyrep) {
      super(Cycleuseendpoint.this, "GET", REST_PATH, null, com.example.agriexpensett.cycleuseendpoint.model.CycleUse.class);
      this.namespace = com.google.api.client.util.Preconditions.checkNotNull(namespace, "Required parameter namespace must be specified.");
      this.keyrep = com.google.api.client.util.Preconditions.checkNotNull(keyrep, "Required parameter keyrep must be specified.");
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
    public GetCycleUse setAlt(java.lang.String alt) {
      return (GetCycleUse) super.setAlt(alt);
    }

    @Override
    public GetCycleUse setFields(java.lang.String fields) {
      return (GetCycleUse) super.setFields(fields);
    }

    @Override
    public GetCycleUse setKey(java.lang.String key) {
      return (GetCycleUse) super.setKey(key);
    }

    @Override
    public GetCycleUse setOauthToken(java.lang.String oauthToken) {
      return (GetCycleUse) super.setOauthToken(oauthToken);
    }

    @Override
    public GetCycleUse setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetCycleUse) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetCycleUse setQuotaUser(java.lang.String quotaUser) {
      return (GetCycleUse) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetCycleUse setUserIp(java.lang.String userIp) {
      return (GetCycleUse) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String namespace;

    /**

     */
    public java.lang.String getNamespace() {
      return namespace;
    }

    public GetCycleUse setNamespace(java.lang.String namespace) {
      this.namespace = namespace;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String keyrep;

    /**

     */
    public java.lang.String getKeyrep() {
      return keyrep;
    }

    public GetCycleUse setKeyrep(java.lang.String keyrep) {
      this.keyrep = keyrep;
      return this;
    }

    @Override
    public GetCycleUse set(String parameterName, Object value) {
      return (GetCycleUse) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertCycleUse".
   *
   * This request holds the parameters needed by the cycleuseendpoint server.  After setting any
   * optional parameters, call the {@link InsertCycleUse#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.example.agriexpensett.cycleuseendpoint.model.CycleUse}
   * @return the request
   */
  public InsertCycleUse insertCycleUse(com.example.agriexpensett.cycleuseendpoint.model.CycleUse content) throws java.io.IOException {
    InsertCycleUse result = new InsertCycleUse(content);
    initialize(result);
    return result;
  }

  public class InsertCycleUse extends CycleuseendpointRequest<com.example.agriexpensett.cycleuseendpoint.model.CycleUse> {

    private static final String REST_PATH = "cycleuse";

    /**
     * Create a request for the method "insertCycleUse".
     *
     * This request holds the parameters needed by the the cycleuseendpoint server.  After setting any
     * optional parameters, call the {@link InsertCycleUse#execute()} method to invoke the remote
     * operation. <p> {@link InsertCycleUse#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.example.agriexpensett.cycleuseendpoint.model.CycleUse}
     * @since 1.13
     */
    protected InsertCycleUse(com.example.agriexpensett.cycleuseendpoint.model.CycleUse content) {
      super(Cycleuseendpoint.this, "POST", REST_PATH, content, com.example.agriexpensett.cycleuseendpoint.model.CycleUse.class);
    }

    @Override
    public InsertCycleUse setAlt(java.lang.String alt) {
      return (InsertCycleUse) super.setAlt(alt);
    }

    @Override
    public InsertCycleUse setFields(java.lang.String fields) {
      return (InsertCycleUse) super.setFields(fields);
    }

    @Override
    public InsertCycleUse setKey(java.lang.String key) {
      return (InsertCycleUse) super.setKey(key);
    }

    @Override
    public InsertCycleUse setOauthToken(java.lang.String oauthToken) {
      return (InsertCycleUse) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertCycleUse setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertCycleUse) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertCycleUse setQuotaUser(java.lang.String quotaUser) {
      return (InsertCycleUse) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertCycleUse setUserIp(java.lang.String userIp) {
      return (InsertCycleUse) super.setUserIp(userIp);
    }

    @Override
    public InsertCycleUse set(String parameterName, Object value) {
      return (InsertCycleUse) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listCycleUse".
   *
   * This request holds the parameters needed by the cycleuseendpoint server.  After setting any
   * optional parameters, call the {@link ListCycleUse#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListCycleUse listCycleUse() throws java.io.IOException {
    ListCycleUse result = new ListCycleUse();
    initialize(result);
    return result;
  }

  public class ListCycleUse extends CycleuseendpointRequest<com.example.agriexpensett.cycleuseendpoint.model.CollectionResponseCycleUse> {

    private static final String REST_PATH = "cycleuse";

    /**
     * Create a request for the method "listCycleUse".
     *
     * This request holds the parameters needed by the the cycleuseendpoint server.  After setting any
     * optional parameters, call the {@link ListCycleUse#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListCycleUse#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListCycleUse() {
      super(Cycleuseendpoint.this, "GET", REST_PATH, null, com.example.agriexpensett.cycleuseendpoint.model.CollectionResponseCycleUse.class);
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
    public ListCycleUse setAlt(java.lang.String alt) {
      return (ListCycleUse) super.setAlt(alt);
    }

    @Override
    public ListCycleUse setFields(java.lang.String fields) {
      return (ListCycleUse) super.setFields(fields);
    }

    @Override
    public ListCycleUse setKey(java.lang.String key) {
      return (ListCycleUse) super.setKey(key);
    }

    @Override
    public ListCycleUse setOauthToken(java.lang.String oauthToken) {
      return (ListCycleUse) super.setOauthToken(oauthToken);
    }

    @Override
    public ListCycleUse setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListCycleUse) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListCycleUse setQuotaUser(java.lang.String quotaUser) {
      return (ListCycleUse) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListCycleUse setUserIp(java.lang.String userIp) {
      return (ListCycleUse) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListCycleUse setCursor(java.lang.String cursor) {
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

    public ListCycleUse setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListCycleUse set(String parameterName, Object value) {
      return (ListCycleUse) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeCycleUse".
   *
   * This request holds the parameters needed by the cycleuseendpoint server.  After setting any
   * optional parameters, call the {@link RemoveCycleUse#execute()} method to invoke the remote
   * operation.
   *
   * @param keyrep
   * @param namespace
   * @return the request
   */
  public RemoveCycleUse removeCycleUse(java.lang.String keyrep, java.lang.String namespace) throws java.io.IOException {
    RemoveCycleUse result = new RemoveCycleUse(keyrep, namespace);
    initialize(result);
    return result;
  }

  public class RemoveCycleUse extends CycleuseendpointRequest<Void> {

    private static final String REST_PATH = "cycleuse/{keyrep}/{namespace}";

    /**
     * Create a request for the method "removeCycleUse".
     *
     * This request holds the parameters needed by the the cycleuseendpoint server.  After setting any
     * optional parameters, call the {@link RemoveCycleUse#execute()} method to invoke the remote
     * operation. <p> {@link RemoveCycleUse#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param keyrep
     * @param namespace
     * @since 1.13
     */
    protected RemoveCycleUse(java.lang.String keyrep, java.lang.String namespace) {
      super(Cycleuseendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.keyrep = com.google.api.client.util.Preconditions.checkNotNull(keyrep, "Required parameter keyrep must be specified.");
      this.namespace = com.google.api.client.util.Preconditions.checkNotNull(namespace, "Required parameter namespace must be specified.");
    }

    @Override
    public RemoveCycleUse setAlt(java.lang.String alt) {
      return (RemoveCycleUse) super.setAlt(alt);
    }

    @Override
    public RemoveCycleUse setFields(java.lang.String fields) {
      return (RemoveCycleUse) super.setFields(fields);
    }

    @Override
    public RemoveCycleUse setKey(java.lang.String key) {
      return (RemoveCycleUse) super.setKey(key);
    }

    @Override
    public RemoveCycleUse setOauthToken(java.lang.String oauthToken) {
      return (RemoveCycleUse) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveCycleUse setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveCycleUse) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveCycleUse setQuotaUser(java.lang.String quotaUser) {
      return (RemoveCycleUse) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveCycleUse setUserIp(java.lang.String userIp) {
      return (RemoveCycleUse) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String keyrep;

    /**

     */
    public java.lang.String getKeyrep() {
      return keyrep;
    }

    public RemoveCycleUse setKeyrep(java.lang.String keyrep) {
      this.keyrep = keyrep;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String namespace;

    /**

     */
    public java.lang.String getNamespace() {
      return namespace;
    }

    public RemoveCycleUse setNamespace(java.lang.String namespace) {
      this.namespace = namespace;
      return this;
    }

    @Override
    public RemoveCycleUse set(String parameterName, Object value) {
      return (RemoveCycleUse) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateCycleUse".
   *
   * This request holds the parameters needed by the cycleuseendpoint server.  After setting any
   * optional parameters, call the {@link UpdateCycleUse#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.example.agriexpensett.cycleuseendpoint.model.CycleUse}
   * @return the request
   */
  public UpdateCycleUse updateCycleUse(com.example.agriexpensett.cycleuseendpoint.model.CycleUse content) throws java.io.IOException {
    UpdateCycleUse result = new UpdateCycleUse(content);
    initialize(result);
    return result;
  }

  public class UpdateCycleUse extends CycleuseendpointRequest<com.example.agriexpensett.cycleuseendpoint.model.CycleUse> {

    private static final String REST_PATH = "cycleuse";

    /**
     * Create a request for the method "updateCycleUse".
     *
     * This request holds the parameters needed by the the cycleuseendpoint server.  After setting any
     * optional parameters, call the {@link UpdateCycleUse#execute()} method to invoke the remote
     * operation. <p> {@link UpdateCycleUse#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.example.agriexpensett.cycleuseendpoint.model.CycleUse}
     * @since 1.13
     */
    protected UpdateCycleUse(com.example.agriexpensett.cycleuseendpoint.model.CycleUse content) {
      super(Cycleuseendpoint.this, "PUT", REST_PATH, content, com.example.agriexpensett.cycleuseendpoint.model.CycleUse.class);
    }

    @Override
    public UpdateCycleUse setAlt(java.lang.String alt) {
      return (UpdateCycleUse) super.setAlt(alt);
    }

    @Override
    public UpdateCycleUse setFields(java.lang.String fields) {
      return (UpdateCycleUse) super.setFields(fields);
    }

    @Override
    public UpdateCycleUse setKey(java.lang.String key) {
      return (UpdateCycleUse) super.setKey(key);
    }

    @Override
    public UpdateCycleUse setOauthToken(java.lang.String oauthToken) {
      return (UpdateCycleUse) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateCycleUse setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateCycleUse) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateCycleUse setQuotaUser(java.lang.String quotaUser) {
      return (UpdateCycleUse) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateCycleUse setUserIp(java.lang.String userIp) {
      return (UpdateCycleUse) super.setUserIp(userIp);
    }

    @Override
    public UpdateCycleUse set(String parameterName, Object value) {
      return (UpdateCycleUse) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Cycleuseendpoint}.
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

    /** Builds a new instance of {@link Cycleuseendpoint}. */
    @Override
    public Cycleuseendpoint build() {
      return new Cycleuseendpoint(this);
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
     * Set the {@link CycleuseendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCycleuseendpointRequestInitializer(
        CycleuseendpointRequestInitializer cycleuseendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cycleuseendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
