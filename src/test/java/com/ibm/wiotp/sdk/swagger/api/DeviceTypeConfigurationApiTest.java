/*
 * IBM Watson IoT Platform Organization Administration REST APIs
 * The Organization Adminstration APIs can be used to configure an organization (including  creating and deleting devices), checking usage, service status and diagnosing device  connection problems. For information on this API, and how to use Watson IoT Platform APIs generally see  [the API documentation](https://console.ng.bluemix.net/docs/services/IoT/reference/api.html). 
 *
 * OpenAPI spec version: 0002
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ibm.wiotp.sdk.swagger.api;

import java.math.BigDecimal;

import org.junit.Test;

import com.ibm.wiotp.sdk.swagger.ApiException;
import com.ibm.wiotp.sdk.swagger.api.DeviceTypeConfigurationApi;
import com.ibm.wiotp.sdk.swagger.model.DeviceType;
import com.ibm.wiotp.sdk.swagger.model.DeviceTypeCreationRequest;
import com.ibm.wiotp.sdk.swagger.model.DeviceTypeListResponse;
import com.ibm.wiotp.sdk.swagger.model.DeviceTypeUpdateRequest;
import com.ibm.wiotp.sdk.swagger.model.ErrorMessage;
import com.ibm.wiotp.sdk.swagger.model.InvalidRequestMessage;

import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeviceTypeConfigurationApi
 */
@Ignore
public class DeviceTypeConfigurationApiTest {

    private final DeviceTypeConfigurationApi api = new DeviceTypeConfigurationApi();

    
    /**
     * List device types
     *
     * Sorting can be performed on any of the following properties (sort order can be reversed by prefixing the property name with &#39;-&#39;): - id - description - deviceInfo.description - deviceInfo.descriptiveLocation - deviceInfo.serialNumber - deviceInfo.deviceClass - deviceInfo.fwVersion - deviceInfo.hwVersion - deviceInfo.manufacturer - deviceInfo.model - edgeConfiguration.enabled - edgeConfiguration.architecture - edgeConfiguration.edgeServices.id - edgeConfiguration.edgeServices.deploymentOverrides  The following facets are supported: - deviceInfo.deviceClass - deviceInfo.fwVersion - deviceInfo.hwVersion - deviceInfo.manufacturer - deviceInfo.model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deviceTypesGetTest() throws ApiException {
        String bookmark = null;
        BigDecimal limit = null;
        List<String> sort = null;
        List<String> facets = null;
        String id = null;
        String description = null;
        String deviceInfoDescription = null;
        String deviceInfoDescriptiveLocation = null;
        String deviceInfoSerialNumber = null;
        String deviceInfoDeviceClass = null;
        String deviceInfoFwVersion = null;
        String deviceInfoHwVersion = null;
        String deviceInfoManufacturer = null;
        String deviceInfoModel = null;
        DeviceTypeListResponse response = api.deviceTypesGet(bookmark, limit, sort, facets, id, description, deviceInfoDescription, deviceInfoDescriptiveLocation, deviceInfoSerialNumber, deviceInfoDeviceClass, deviceInfoFwVersion, deviceInfoHwVersion, deviceInfoManufacturer, deviceInfoModel);

        // TODO: test validations
    }
    
    /**
     * Create device type
     *
     * Creates a device type for a normal device or a gateway. Gateways are specialization of devices but have the additional permission to register new devices and act on behalf of a device that is assigned to the gateway.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deviceTypesPostTest() throws ApiException {
        DeviceTypeCreationRequest deviceType = null;
        DeviceType response = api.deviceTypesPost(deviceType);

        // TODO: test validations
    }
    
    /**
     * Delete device type
     *
     * Deletes a device type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deviceTypesTypeIdDeleteTest() throws ApiException {
        String typeId = null;
        api.deviceTypesTypeIdDelete(typeId);

        // TODO: test validations
    }
    
    /**
     * Get device type
     *
     * Gets device type details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deviceTypesTypeIdGetTest() throws ApiException {
        String typeId = null;
        DeviceType response = api.deviceTypesTypeIdGet(typeId);

        // TODO: test validations
    }
    
    /**
     * Update device type
     *
     * Updates a device type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deviceTypesTypeIdPutTest() throws ApiException {
        String typeId = null;
        DeviceTypeUpdateRequest deviceTypeUpdate = null;
        DeviceType response = api.deviceTypesTypeIdPut(typeId, deviceTypeUpdate);

        // TODO: test validations
    }
    
}
