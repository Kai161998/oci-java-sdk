/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface BlockstorageAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Creates a new volume in the specified compartment. Volumes can be created in sizes ranging from
     * 50 GB (51200 MB) to 16 TB (16777216 MB), in 1 GB (1024 MB) increments. By default, volumes are 1 TB (1048576 MB).
     * For general information about block volumes, see
     * [Overview of Block Volume Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/overview.htm).
     * <p>
     * A volume and instance can be in separate compartments but must be in the same Availability Domain.
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about
     * Availability Domains, see [Regions and Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
     * To get a list of Availability Domains, use the `ListAvailabilityDomains` operation
     * in the Identity and Access Management Service API.
     * <p>
     * You may optionally specify a *display name* for the volume, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVolumeResponse> createVolume(
            CreateVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateVolumeRequest, CreateVolumeResponse>
                    handler);

    /**
     * Creates a new backup of the specified volume. For general information about volume backups,
     * see [Overview of Block Volume Service Backups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/blockvolumebackups.htm)
     * <p>
     * When the request is received, the backup object is in a REQUEST_RECEIVED state.
     * When the data is imaged, it goes into a CREATING state.
     * After the backup is fully uploaded to the cloud, it goes into an AVAILABLE state.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVolumeBackupResponse> createVolumeBackup(
            CreateVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVolumeBackupRequest, CreateVolumeBackupResponse>
                    handler);

    /**
     * Assigns a policy to the specified asset, such as a volume. Note that a given asset can
     * only have one policy assigned to it; if this method is called for an asset that previously
     * has a different policy assigned, the prior assignment will be silently deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVolumeBackupPolicyAssignmentResponse>
            createVolumeBackupPolicyAssignment(
                    CreateVolumeBackupPolicyAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateVolumeBackupPolicyAssignmentRequest,
                                    CreateVolumeBackupPolicyAssignmentResponse>
                            handler);

    /**
     * Deletes the specified boot volume. The volume cannot have an active connection to an instance.
     * To disconnect the boot volume from a connected instance, see
     * [Disconnecting From a Boot Volume](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Tasks/deletingbootvolume.htm).
     * **Warning:** All data on the boot volume will be permanently lost when the boot volume is deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBootVolumeResponse> deleteBootVolume(
            DeleteBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBootVolumeRequest, DeleteBootVolumeResponse>
                    handler);

    /**
     * Deletes the specified volume. The volume cannot have an active connection to an instance.
     * To disconnect the volume from a connected instance, see
     * [Disconnecting From a Volume](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Tasks/disconnectingfromavolume.htm).
     * **Warning:** All data on the volume will be permanently lost when the volume is deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVolumeResponse> deleteVolume(
            DeleteVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResponse>
                    handler);

    /**
     * Deletes a volume backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVolumeBackupResponse> deleteVolumeBackup(
            DeleteVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeBackupRequest, DeleteVolumeBackupResponse>
                    handler);

    /**
     * Deletes a volume backup policy assignment (i.e. unassigns the policy from an asset).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVolumeBackupPolicyAssignmentResponse>
            deleteVolumeBackupPolicyAssignment(
                    DeleteVolumeBackupPolicyAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteVolumeBackupPolicyAssignmentRequest,
                                    DeleteVolumeBackupPolicyAssignmentResponse>
                            handler);

    /**
     * Gets information for the specified boot volume.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBootVolumeResponse> getBootVolume(
            GetBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBootVolumeRequest, GetBootVolumeResponse>
                    handler);

    /**
     * Gets information for the specified volume.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeResponse> getVolume(
            GetVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVolumeRequest, GetVolumeResponse> handler);

    /**
     * Gets information for the specified volume backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeBackupResponse> getVolumeBackup(
            GetVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVolumeBackupRequest, GetVolumeBackupResponse>
                    handler);

    /**
     * Gets information for the specified volume backup policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeBackupPolicyResponse> getVolumeBackupPolicy(
            GetVolumeBackupPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeBackupPolicyRequest, GetVolumeBackupPolicyResponse>
                    handler);

    /**
     * Gets the volume backup policy assignment for the specified asset. Note that the
     * assetId query parameter is required, and that the returned list will contain at most
     * one item (since any given asset can only have one policy assigned to it).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeBackupPolicyAssetAssignmentResponse>
            getVolumeBackupPolicyAssetAssignment(
                    GetVolumeBackupPolicyAssetAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetVolumeBackupPolicyAssetAssignmentRequest,
                                    GetVolumeBackupPolicyAssetAssignmentResponse>
                            handler);

    /**
     * Gets information for the specified volume backup policy assignment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeBackupPolicyAssignmentResponse>
            getVolumeBackupPolicyAssignment(
                    GetVolumeBackupPolicyAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetVolumeBackupPolicyAssignmentRequest,
                                    GetVolumeBackupPolicyAssignmentResponse>
                            handler);

    /**
     * Lists the boot volumes in the specified compartment and Availability Domain.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListBootVolumesResponse> listBootVolumes(
            ListBootVolumesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBootVolumesRequest, ListBootVolumesResponse>
                    handler);

    /**
     * Lists all volume backup policies available to the caller.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVolumeBackupPoliciesResponse> listVolumeBackupPolicies(
            ListVolumeBackupPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeBackupPoliciesRequest, ListVolumeBackupPoliciesResponse>
                    handler);

    /**
     * Lists the volume backups in the specified compartment. You can filter the results by volume.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVolumeBackupsResponse> listVolumeBackups(
            ListVolumeBackupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeBackupsRequest, ListVolumeBackupsResponse>
                    handler);

    /**
     * Lists the volumes in the specified compartment and Availability Domain.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVolumesResponse> listVolumes(
            ListVolumesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListVolumesRequest, ListVolumesResponse> handler);

    /**
     * Updates the specified boot volume's display name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBootVolumeResponse> updateBootVolume(
            UpdateBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBootVolumeRequest, UpdateBootVolumeResponse>
                    handler);

    /**
     * Updates the specified volume's display name.
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVolumeResponse> updateVolume(
            UpdateVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResponse>
                    handler);

    /**
     * Updates the display name for the specified volume backup.
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVolumeBackupResponse> updateVolumeBackup(
            UpdateVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeBackupRequest, UpdateVolumeBackupResponse>
                    handler);
}
