/*
 * IBM Watson IoT Platform Organization Information Management REST APIs
 * The Information Management APIs can be used to access device event data as well as  get and update device location and obtain weather information for that location. For information on this API, and how to use Watson IoT Platform APIs generally see  [the API documentation](https://console.ng.bluemix.net/docs/services/IoT/reference/api.html).  version: \"0002\" 
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ibm.wiotp.sdk.swagger.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ErrorMessageException
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-30T18:07:14.805+01:00")
public class ErrorMessageException {
  @SerializedName("id")
  private String id = null;

  @SerializedName("properties")
  private List<String> properties = new ArrayList<String>();

  public ErrorMessageException id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique message ID of the exception encountered
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique message ID of the exception encountered")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ErrorMessageException properties(List<String> properties) {
    this.properties = properties;
    return this;
  }

  public ErrorMessageException addPropertiesItem(String propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * List of arguments for this specific instance of the exception
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "List of arguments for this specific instance of the exception")
  public List<String> getProperties() {
    return properties;
  }

  public void setProperties(List<String> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorMessageException errorMessageException = (ErrorMessageException) o;
    return Objects.equals(this.id, errorMessageException.id) &&
        Objects.equals(this.properties, errorMessageException.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMessageException {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
