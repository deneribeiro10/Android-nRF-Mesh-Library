package no.nordicsemi.android.meshprovisioner;

import no.nordicsemi.android.meshprovisioner.transport.ApplicationKey;
import no.nordicsemi.android.meshprovisioner.transport.NetworkKey;

interface MeshNetworkCallbacks {

    void onMeshNetworkUpdated();

    void onNetworkKeyAdded(final NetworkKey networkKey);

    void onNetworkKeyUpdated(final NetworkKey networkKey);

    void onNetworkKeyDeleted(final NetworkKey networkKey);

    void onApplicationKeyAdded(final ApplicationKey applicationKey);

    void onApplicationKeyUpdated(final ApplicationKey applicationKey);

    void onApplicationKeyDeleted(final ApplicationKey applicationKey);

    void onProvisionerUpdated(final Provisioner provisioner);

    void onGroupAdded(final Group group);

    void onGroupUpdated(final Group group);

    void onGroupDeleted(final Group group);

    void onSceneAdded(final Scene scene);

    void onSceneUpdated(final Scene scene);

    void onSceneDeleted(final Scene scene);
}
