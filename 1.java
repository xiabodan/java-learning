/*
 *  * This file is auto-generated.  DO NOT MODIFY.
 *   * Original file: /home/xiabo/tool/code/kxqpplatform/kxqpplatform2/src/com/excelliance/kxqp/platform/aidl/ILBActivityManager.aidl
 *    */
package com.excelliance.kxqp.platform.aidl;
public interface ILBActivityManager extends android.os.IInterface
{
    /** Local-side IPC implementation stub class. */
    public static abstract class Stub extends android.os.Binder implements com.excelliance.kxqp.platform.aidl.ILBActivityManager
    {
        private static final java.lang.String DESCRIPTOR = "com.excelliance.kxqp.platform.aidl.ILBActivityManager";
        /** Construct the stub at attach it to the interface. */
        public Stub()
        {
            this.attachInterface(this, DESCRIPTOR);
        }
        /**
         *  * Cast an IBinder object into an com.excelliance.kxqp.platform.aidl.ILBActivityManager interface,
         *   * generating a proxy if needed.
         *    */
        public static com.excelliance.kxqp.platform.aidl.ILBActivityManager asInterface(android.os.IBinder obj)
        {
            if ((obj==null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin!=null)&&(iin instanceof com.excelliance.kxqp.platform.aidl.ILBActivityManager))) {
                return ((com.excelliance.kxqp.platform.aidl.ILBActivityManager)iin);
            }
            return new com.excelliance.kxqp.platform.aidl.ILBActivityManager.Stub.Proxy(obj);
        }
        @Override public android.os.IBinder asBinder()
        {
            return this;
        }
        @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
        {
            switch (code)
            {
                case INTERFACE_TRANSACTION:
                    {
                        reply.writeString(DESCRIPTOR);
                        return true;
                    }
                case TRANSACTION_waitForReady:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        boolean _result = this.waitForReady();
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_getLBActivityManagerServicePid:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _result = this.getLBActivityManagerServicePid();
                        reply.writeNoException();
                        reply.writeInt(_result);
                        return true;
                    }
                case TRANSACTION_broadcastIntent:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.Intent _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        java.util.List<java.lang.String> _arg2;
                        _arg2 = data.createStringArrayList();
                        com.excelliance.kxqp.platform.parcel.LBProcessInfo _arg3;
                        if ((0!=data.readInt())) {
                            _arg3 = com.excelliance.kxqp.platform.parcel.LBProcessInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg3 = null;
                        }
                        int _arg4;
                        _arg4 = data.readInt();
                        this.broadcastIntent(_arg0, _arg1, _arg2, _arg3, _arg4);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_startActivity:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.Intent _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        android.os.IBinder _arg2;
                        _arg2 = data.readStrongBinder();
                        int _arg3;
                        _arg3 = data.readInt();
                        android.os.Bundle _arg4;
                        if ((0!=data.readInt())) {
                            _arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg4 = null;
                        }
                        com.excelliance.kxqp.platform.parcel.LBProcessInfo _arg5;
                        if ((0!=data.readInt())) {
                            _arg5 = com.excelliance.kxqp.platform.parcel.LBProcessInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg5 = null;
                        }
                        int _result = this.startActivity(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
                        reply.writeNoException();
                        reply.writeInt(_result);
                        return true;
                    }
                case TRANSACTION_startService:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.Intent _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        com.excelliance.kxqp.platform.parcel.LBProcessInfo _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = com.excelliance.kxqp.platform.parcel.LBProcessInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        android.content.ComponentName _result = this.startService(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_preStartProcess:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        int _arg2;
                        _arg2 = data.readInt();
                        android.content.Intent _arg3;
                        if ((0!=data.readInt())) {
                            _arg3 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg3 = null;
                        }
                        com.excelliance.kxqp.platform.parcel.LBProcessInfo _arg4;
                        if ((0!=data.readInt())) {
                            _arg4 = com.excelliance.kxqp.platform.parcel.LBProcessInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg4 = null;
                        }
                        this.preStartProcess(_arg0, _arg1, _arg2, _arg3, _arg4);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_selectActivityProxy:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.pm.ActivityInfo _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        nfo _result = this.selectActivityProxy(_arg0, _arg1);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_selectServiceProxy:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.pm.ServiceInfo _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        android.content.pm.ServiceInfo _result = this.selectServiceProxy(_arg0, _arg1);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_selectProviderProxy:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        android.content.pm.ProviderInfo _result = this.selectProviderProxy(_arg0, _arg1);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_selectReceiverProxy:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.pm.ActivityInfo _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        android.content.pm.ActivityInfo _result = this.selectReceiverProxy(_arg0, _arg1);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_getTopActivityInTask:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.Intent _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        android.content.pm.ActivityInfo _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        android.os.IBinder _result = this.getTopActivityInTask(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        reply.writeStrongBinder(_result);
                        return true;
                    }
                case TRANSACTION_getTargetPackageNameByPid:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        int _arg1;
                        _arg1 = data.readInt();
                        java.util.List<java.lang.String> _result = this.getTargetPackageNameByPid(_arg0, _arg1);
                        reply.writeNoException();
                        reply.writeStringList(_result);
                        return true;
                    }
                case TRANSACTION_getTargetProcessNameByPid:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        int _arg1;
                        _arg1 = data.readInt();
                        java.lang.String _result = this.getTargetProcessNameByPid(_arg0, _arg1);
                        reply.writeNoException();
                        reply.writeString(_result);
                        return true;
                    }
                case TRANSACTION_killBackgroundProcesses:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        boolean _result = this.killBackgroundProcesses(_arg0, _arg1);
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_killApplicationProcess:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        boolean _result = this.killApplicationProcess(_arg0, _arg1);
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_forceStopPackage:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        boolean _result = this.forceStopPackage(_arg0, _arg1);
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_reportLaunchActivity:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        com.excelliance.kxqp.platform.aidl.IProcessCB _arg1;
                        _arg1 = com.excelliance.kxqp.platform.aidl.IProcessCB.Stub.asInterface(data.readStrongBinder());
                        android.os.IBinder _arg2;
                        _arg2 = data.readStrongBinder();
                        android.content.pm.ActivityInfo _arg3;
                        if ((0!=data.readInt())) {
                            _arg3 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg3 = null;
                        }
                        java.lang.String _arg4;
                        _arg4 = data.readString();
                        int _arg5;
                        _arg5 = data.readInt();
                        android.content.Intent _arg6;
                        if ((0!=data.readInt())) {
                            _arg6 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg6 = null;
                        }
                        this.reportLaunchActivity(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_reportLaunchProxyActivity:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        com.excelliance.kxqp.platform.aidl.IProcessCB _arg1;
                        _arg1 = com.excelliance.kxqp.platform.aidl.IProcessCB.Stub.asInterface(data.readStrongBinder());
                        android.os.IBinder _arg2;
                        _arg2 = data.readStrongBinder();
                        android.content.pm.ActivityInfo _arg3;
                        if ((0!=data.readInt())) {
                            _arg3 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg3 = null;
                        }
                        android.content.pm.ActivityInfo _arg4;
                        if ((0!=data.readInt())) {
                            _arg4 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg4 = null;
                        }
                        java.lang.String _arg5;
                        _arg5 = data.readString();
                        int _arg6;
                        _arg6 = data.readInt();
                        android.content.Intent _arg7;
                        if ((0!=data.readInt())) {
                            _arg7 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg7 = null;
                        }
                        this.reportLaunchProxyActivity(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_reportDestroyActivity:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.os.IBinder _arg1;
                        _arg1 = data.readStrongBinder();
                        this.reportDestroyActivity(_arg0, _arg1);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_reportFinishActivity:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.os.IBinder _arg1;
                        _arg1 = data.readStrongBinder();
                        this.reportFinishActivity(_arg0, _arg1);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_makeActivityProxyIntent:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        com.excelliance.kxqp.platform.aidl.IProcessCB _arg1;
                        _arg1 = com.excelliance.kxqp.platform.aidl.IProcessCB.Stub.asInterface(data.readStrongBinder());
                        android.os.IBinder _arg2;
                        _arg2 = data.readStrongBinder();
                        int _arg3;
                        _arg3 = data.readInt();
                        android.content.Intent _arg4;
                        if ((0!=data.readInt())) {
                            _arg4 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg4 = null;
                        }
                        android.content.pm.ActivityInfo _arg5;
                        if ((0!=data.readInt())) {
                            _arg5 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg5 = null;
                        }
                        android.os.Bundle _arg6;
                        if ((0!=data.readInt())) {
                            _arg6 = android.os.Bundle.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg6 = null;
                        }
                        boolean _arg7;
                        _arg7 = (0!=data.readInt());
                        com.excelliance.kxqp.platform.parcel.LBProcessInfo _arg8;
                        if ((0!=data.readInt())) {
                            _arg8 = com.excelliance.kxqp.platform.parcel.LBProcessInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg8 = null;
                        }
                        int _arg9;
                        _arg9 = data.readInt();
                        android.content.Intent _result = this.makeActivityProxyIntent(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_makeActivityProxyIntents:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        com.excelliance.kxqp.platform.aidl.IProcessCB _arg1;
                        _arg1 = com.excelliance.kxqp.platform.aidl.IProcessCB.Stub.asInterface(data.readStrongBinder());
                        android.os.IBinder _arg2;
                        _arg2 = data.readStrongBinder();
                        int _arg3;
                        _arg3 = data.readInt();
                        android.content.Intent[] _arg4;
                        _arg4 = data.createTypedArray(android.content.Intent.CREATOR);
                        android.content.pm.ActivityInfo[] _arg5;
                        _arg5 = data.createTypedArray(android.content.pm.ActivityInfo.CREATOR);
                        android.os.Bundle _arg6;
                        if ((0!=data.readInt())) {
                            _arg6 = android.os.Bundle.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg6 = null;
                        }
                        boolean _arg7;
                        _arg7 = (0!=data.readInt());
                        com.excelliance.kxqp.platform.parcel.LBProcessInfo _arg8;
                        if ((0!=data.readInt())) {
                            _arg8 = com.excelliance.kxqp.platform.parcel.LBProcessInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg8 = null;
                        }
                        android.content.Intent[] _result = this.makeActivityProxyIntents(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
                        reply.writeNoException();
                        reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        return true;
                    }
                case TRANSACTION_getTasks:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        int _arg2;
                        _arg2 = data.readInt();
                        boolean _arg3;
                        _arg3 = (0!=data.readInt());
                        java.util.List _result = this.getTasks(_arg0, _arg1, _arg2, _arg3);
                        reply.writeNoException();
                        reply.writeList(_result);
                        return true;
                    }
                case TRANSACTION_getRecentTasks:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        int _arg2;
                        _arg2 = data.readInt();
                        int _arg3;
                        _arg3 = data.readInt();
                        java.util.List _result = this.getRecentTasks(_arg0, _arg1, _arg2, _arg3);
                        reply.writeNoException();
                        reply.writeList(_result);
                        return true;
                    }
                case TRANSACTION_isPluginTask:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        int _arg1;
                        _arg1 = data.readInt();
                        java.lang.String _arg2;
                        _arg2 = data.readString();
                        boolean _result = this.isPluginTask(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_fixPluginTaskInfo:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.app.ActivityManager.RecentTaskInfo _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.app.ActivityManager.RecentTaskInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        this.fixPluginTaskInfo(_arg0, _arg1);
                        reply.writeNoException();
                        if ((_arg1!=null)) {
                            reply.writeInt(1);
                            _arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_onServiceCreated:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.pm.ServiceInfo _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        android.content.pm.ServiceInfo _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        this.onServiceCreated(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_onServiceDestory:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.pm.ServiceInfo _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        android.content.pm.ServiceInfo _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        this.onServiceDestory(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_getTargetServiceInfo:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        android.content.ComponentName _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = android.content.ComponentName.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        java.util.List<android.content.pm.ServiceInfo> _result = this.getTargetServiceInfo(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        reply.writeTypedList(_result);
                        return true;
                    }
                case TRANSACTION_startProcess:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.os.Bundle _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        boolean _arg2;
                        _arg2 = (0!=data.readInt());
                        boolean _arg3;
                        _arg3 = (0!=data.readInt());
                        int _arg4;
                        _arg4 = data.readInt();
                        java.lang.String _arg5;
                        _arg5 = data.readString();
                        com.excelliance.kxqp.platform.parcel.LBProcessInfo _arg6;
                        if ((0!=data.readInt())) {
                            _arg6 = com.excelliance.kxqp.platform.parcel.LBProcessInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg6 = null;
                        }
                        int _result = this.startProcess(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
                        reply.writeNoException();
                        reply.writeInt(_result);
                        return true;
                    }
                case TRANSACTION_registerServiceConn:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        com.excelliance.kxqp.platform.aidl.IProcessCB _arg1;
                        _arg1 = com.excelliance.kxqp.platform.aidl.IProcessCB.Stub.asInterface(data.readStrongBinder());
                        android.os.IBinder _arg2;
                        _arg2 = data.readStrongBinder();
                        android.content.pm.ServiceInfo _arg3;
                        if ((0!=data.readInt())) {
                            _arg3 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg3 = null;
                        }
                        this.registerServiceConn(_arg0, _arg1, _arg2, _arg3);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_unregisterServiceConn:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        com.excelliance.kxqp.platform.aidl.IProcessCB _arg1;
                        _arg1 = com.excelliance.kxqp.platform.aidl.IProcessCB.Stub.asInterface(data.readStrongBinder());
                        android.os.IBinder _arg2;
                        _arg2 = data.readStrongBinder();
                        this.unregisterServiceConn(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_getBindId:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.pm.ServiceInfo _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        long _result = this.getBindId(_arg0, _arg1);
                        reply.writeNoException();
                        reply.writeLong(_result);
                        return true;
                    }
                case TRANSACTION_stopService:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.pm.ServiceInfo _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.pm.ServiceInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        android.content.Intent _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        int _result = this.stopService(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        reply.writeInt(_result);
                        return true;
                    }
                case TRANSACTION_finishStaticBroadcast:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.pm.ActivityInfo _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        com.excelliance.kxqp.platform.parcel.PendingResultInfo _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = com.excelliance.kxqp.platform.parcel.PendingResultInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        this.finishStaticBroadcast(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_registerReceiver:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        com.excelliance.kxqp.platform.aidl.IProcessCB _arg1;
                        _arg1 = com.excelliance.kxqp.platform.aidl.IProcessCB.Stub.asInterface(data.readStrongBinder());
                        android.os.IBinder _arg2;
                        _arg2 = data.readStrongBinder();
                        android.content.IntentFilter _arg3;
                        if ((0!=data.readInt())) {
                            _arg3 = android.content.IntentFilter.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg3 = null;
                        }
                        this.registerReceiver(_arg0, _arg1, _arg2, _arg3);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_unregisterReceiver:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        com.excelliance.kxqp.platform.aidl.IProcessCB _arg1;
                        _arg1 = com.excelliance.kxqp.platform.aidl.IProcessCB.Stub.asInterface(data.readStrongBinder());
                        android.os.IBinder _arg2;
                        _arg2 = data.readStrongBinder();
                        this.unregisterReceiver(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_isBroadcastIntentTargetToPlugin:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.Intent _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        boolean _result = this.isBroadcastIntentTargetToPlugin(_arg0, _arg1);
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_isBroadcastIntentTargetToPluginNew:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        android.content.Intent _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        boolean _result = this.isBroadcastIntentTargetToPluginNew(_arg0, _arg1);
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_isAllowedPackageRunning:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        boolean _result = this.isAllowedPackageRunning(_arg0, _arg1);
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_recordNotification:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        int _arg2;
                        _arg2 = data.readInt();
                        java.lang.String _arg3;
                        _arg3 = data.readString();
                        com.excelliance.kxqp.platform.parcel.LBNotificationRecord _result = this.recordNotification(_arg0, _arg1, _arg2, _arg3);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_removeNotification:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        int _arg2;
                        _arg2 = data.readInt();
                        java.lang.String _arg3;
                        _arg3 = data.readString();
                        this.removeNotification(_arg0, _arg1, _arg2, _arg3);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_cancelAllNotifications:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        this.cancelAllNotifications(_arg0, _arg1);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_getEnabledNotificationListenerServices:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _result = this.getEnabledNotificationListenerServices(_arg0);
                        reply.writeNoException();
                        reply.writeString(_result);
                        return true;
                    }
                case TRANSACTION_checkPermission:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        int _arg2;
                        _arg2 = data.readInt();
                        int _arg3;
                        _arg3 = data.readInt();
                        int _result = this.checkPermission(_arg0, _arg1, _arg2, _arg3);
                        reply.writeNoException();
                        reply.writeInt(_result);
                        return true;
                    }
                case TRANSACTION_getSettingsProviderString:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        int _arg1;
                        _arg1 = data.readInt();
                        java.lang.String _arg2;
                        _arg2 = data.readString();
                        java.lang.String _result = this.getSettingsProviderString(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        reply.writeString(_result);
                        return true;
                    }
                case TRANSACTION_putSettingsProviderString:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        int _arg1;
                        _arg1 = data.readInt();
                        java.lang.String _arg2;
                        _arg2 = data.readString();
                        java.lang.String _arg3;
                        _arg3 = data.readString();
                        this.putSettingsProviderString(_arg0, _arg1, _arg2, _arg3);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_recordPendingIntent:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        android.os.IBinder _arg0;
                        _arg0 = data.readStrongBinder();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        android.content.Intent _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = android.content.Intent.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        this.recordPendingIntent(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_removePendingIntent:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        android.os.IBinder _arg0;
                        _arg0 = data.readStrongBinder();
                        this.removePendingIntent(_arg0);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_getPendingIntentData:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        android.os.IBinder _arg0;
                        _arg0 = data.readStrongBinder();
                        com.excelliance.kxqp.platform.parcel.LBPendingIntentWrapper _result = this.getPendingIntentData(_arg0);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_getRunningAppProcesses:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        int _arg1;
                        _arg1 = data.readInt();
                        com.excelliance.kxqp.platform.parcel.LBParceledListSlice _result = this.getRunningAppProcesses(_arg0, _arg1);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_getRunningServices:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        int _arg1;
                        _arg1 = data.readInt();
                        boolean _arg2;
                        _arg2 = (0!=data.readInt());
                        com.excelliance.kxqp.platform.parcel.LBParceledListSlice _result = this.getRunningServices(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
                case TRANSACTION_getRunningAppMemoryInfos:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.util.List _result = this.getRunningAppMemoryInfos(_arg0);
                        reply.writeNoException();
                        reply.writeList(_result);
                        return true;
                    }
                case TRANSACTION_handleApplicationCrash:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        com.excelliance.kxqp.platform.parcel.LBCrashInfo _arg1;
                        if ((0!=data.readInt())) {
                            _arg1 = com.excelliance.kxqp.platform.parcel.LBCrashInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg1 = null;
                        }
                        this.handleApplicationCrash(_arg0, _arg1);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_hasCrashLogReceiver:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        boolean _result = this.hasCrashLogReceiver();
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_setRunningPackagesLimit:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        int _arg1;
                        _arg1 = data.readInt();
                        boolean _result = this.setRunningPackagesLimit(_arg0, _arg1);
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_notifyBadge:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        com.excelliance.kxqp.platform.parcel.LBBadgeInfo _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = com.excelliance.kxqp.platform.parcel.LBBadgeInfo.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        this.notifyBadge(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_getBadgeInfo:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result = this.getBadgeInfo();
                        reply.writeNoException();
                        reply.writeByteArray(_result);
                        return true;
                    }
                case TRANSACTION_splashStart:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        android.os.Bundle _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        this.splashStart(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_splashStop:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        java.lang.String _arg1;
                        _arg1 = data.readString();
                        android.os.Bundle _arg2;
                        if ((0!=data.readInt())) {
                            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg2 = null;
                        }
                        this.splashStop(_arg0, _arg1, _arg2);
                        reply.writeNoException();
                        return true;
                    }
                case TRANSACTION_setAmsForeground:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0;
                        _arg0 = data.readInt();
                        boolean _result = this.setAmsForeground(_arg0);
                        reply.writeNoException();
                        reply.writeInt(((_result)?(1):(0)));
                        return true;
                    }
                case TRANSACTION_execCommand:
                    {
                        data.enforceInterface(DESCRIPTOR);
                        java.util.List<java.lang.String> _arg0;
                        _arg0 = data.createStringArrayList();
                        java.util.Map _arg1;
                        java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
                        _arg1 = data.readHashMap(cl);
                        java.lang.String _arg2;
                        _arg2 = data.readString();
                        int _arg3;
                        _arg3 = data.readInt();
                        android.os.Bundle _arg4;
                        if ((0!=data.readInt())) {
                            _arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
                        }
                        else {
                            _arg4 = null;
                        }
                        android.os.Bundle _result = this.execCommand(_arg0, _arg1, _arg2, _arg3, _arg4);
                        reply.writeNoException();
                        if ((_result!=null)) {
                            reply.writeInt(1);
                            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
                        }
                        else {
                            reply.writeInt(0);
                        }
                        return true;
                    }
            }
            return super.onTransact(code, data, reply, flags);
        }
        private static class Proxy implements com.excelliance.kxqp.platform.aidl.ILBActivityManager
        {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder remote)
            {
                mRemote = remote;
            }
            @Override public android.os.IBinder asBinder()
            {
                return mRemote;
            }
            public java.lang.String getInterfaceDescriptor()
            {
                return DESCRIPTOR;
            }
            @Override public boolean waitForReady() throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_waitForReady, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int getLBActivityManagerServicePid() throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getLBActivityManagerServicePid, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void broadcastIntent(int vuid, android.content.Intent intent, java.util.List<java.lang.String> pkgs, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller, int flags) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((intent!=null)) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeStringList(pkgs);
                    if ((caller!=null)) {
                        _data.writeInt(1);
                        caller.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeInt(flags);
                    mRemote.transact(Stub.TRANSACTION_broadcastIntent, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public int startActivity(int vuid, android.content.Intent intent, android.os.IBinder resultTo, int requestCode, android.os.Bundle options, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((intent!=null)) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeStrongBinder(resultTo);
                    _data.writeInt(requestCode);
                    if ((options!=null)) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((caller!=null)) {
                        _data.writeInt(1);
                        caller.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_startActivity, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public android.content.ComponentName startService(int vuid, android.content.Intent intent, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.content.ComponentName _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((intent!=null)) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((caller!=null)) {
                        _data.writeInt(1);
                        caller.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_startService, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void preStartProcess(int vuid, java.lang.String packageName, int type, android.content.Intent intent, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    _data.writeInt(type);
                    if ((intent!=null)) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((caller!=null)) {
                        _data.writeInt(1);
                        caller.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_preStartProcess, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public android.content.pm.ActivityInfo selectActivityProxy(int vuid, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.content.pm.ActivityInfo _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((targetInfo!=null)) {
                        _data.writeInt(1);
                        targetInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_selectActivityProxy, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public android.content.pm.ServiceInfo selectServiceProxy(int vuid, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.content.pm.ServiceInfo _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((targetInfo!=null)) {
                        _data.writeInt(1);
                        targetInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_selectServiceProxy, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = android.content.pm.ServiceInfo.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public android.content.pm.ProviderInfo selectProviderProxy(int vuid, java.lang.String name) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.content.pm.ProviderInfo _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(name);
                    mRemote.transact(Stub.TRANSACTION_selectProviderProxy, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = android.content.pm.ProviderInfo.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public android.content.pm.ActivityInfo selectReceiverProxy(int vuid, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.content.pm.ActivityInfo _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((targetInfo!=null)) {
                        _data.writeInt(1);
                        targetInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_selectReceiverProxy, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public android.os.IBinder getTopActivityInTask(int vuid, android.content.Intent intent, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((intent!=null)) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((targetInfo!=null)) {
                        _data.writeInt(1);
                        targetInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getTopActivityInTask, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public java.util.List<java.lang.String> getTargetPackageNameByPid(int vuid, int pid) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.util.List<java.lang.String> _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeInt(pid);
                    mRemote.transact(Stub.TRANSACTION_getTargetPackageNameByPid, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createStringArrayList();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public java.lang.String getTargetProcessNameByPid(int vuid, int pid) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.lang.String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeInt(pid);
                    mRemote.transact(Stub.TRANSACTION_getTargetProcessNameByPid, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean killBackgroundProcesses(int vuid, java.lang.String packageName) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    mRemote.transact(Stub.TRANSACTION_killBackgroundProcesses, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean killApplicationProcess(int vuid, java.lang.String pluginPackageName) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(pluginPackageName);
                    mRemote.transact(Stub.TRANSACTION_killApplicationProcess, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean forceStopPackage(int vuid, java.lang.String pluginPackageName) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(pluginPackageName);
                    mRemote.transact(Stub.TRANSACTION_forceStopPackage, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void reportLaunchActivity(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder token, android.content.pm.ActivityInfo activityInfo, java.lang.String taskAffinity, int taskId, android.content.Intent taskIntent) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
                    _data.writeStrongBinder(token);
                    if ((activityInfo!=null)) {
                        _data.writeInt(1);
                        activityInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeString(taskAffinity);
                    _data.writeInt(taskId);
                    if ((taskIntent!=null)) {
                        _data.writeInt(1);
                        taskIntent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_reportLaunchActivity, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void reportLaunchProxyActivity(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder token, android.content.pm.ActivityInfo proxyInfo, android.content.pm.ActivityInfo targetInfo, java.lang.String taskAffinity, int taskId, android.content.Intent taskIntent) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
                    _data.writeStrongBinder(token);
                    if ((proxyInfo!=null)) {
                        _data.writeInt(1);
                        proxyInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((targetInfo!=null)) {
                        _data.writeInt(1);
                        targetInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeString(taskAffinity);
                    _data.writeInt(taskId);
                    if ((taskIntent!=null)) {
                        _data.writeInt(1);
                        taskIntent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_reportLaunchProxyActivity, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void reportDestroyActivity(int vuid, android.os.IBinder token) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeStrongBinder(token);
                    mRemote.transact(Stub.TRANSACTION_reportDestroyActivity, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void reportFinishActivity(int vuid, android.os.IBinder token) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeStrongBinder(token);
                    mRemote.transact(Stub.TRANSACTION_reportFinishActivity, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public android.content.Intent makeActivityProxyIntent(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder resultTo, int requestCode, android.content.Intent intent, android.content.pm.ActivityInfo activityInfo, android.os.Bundle options, boolean sourcefromServer, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller, int taskId) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.content.Intent _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
                    _data.writeStrongBinder(resultTo);
                    _data.writeInt(requestCode);
                    if ((intent!=null)) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((activityInfo!=null)) {
                        _data.writeInt(1);
                        activityInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((options!=null)) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeInt(((sourcefromServer)?(1):(0)));
                    if ((caller!=null)) {
                        _data.writeInt(1);
                        caller.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeInt(taskId);
                    mRemote.transact(Stub.TRANSACTION_makeActivityProxyIntent, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = android.content.Intent.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public android.content.Intent[] makeActivityProxyIntents(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder resultTo, int requestCode, android.content.Intent[] intents, android.content.pm.ActivityInfo[] activityInfos, android.os.Bundle options, boolean sourcefromServer, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.content.Intent[] _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
                    _data.writeStrongBinder(resultTo);
                    _data.writeInt(requestCode);
                    _data.writeTypedArray(intents, 0);
                    _data.writeTypedArray(activityInfos, 0);
                    if ((options!=null)) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeInt(((sourcefromServer)?(1):(0)));
                    if ((caller!=null)) {
                        _data.writeInt(1);
                        caller.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_makeActivityProxyIntents, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createTypedArray(android.content.Intent.CREATOR);
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public java.util.List getTasks(int vuid, java.lang.String packageName, int maxNum, boolean onlyPlugin) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.util.List _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    _data.writeInt(maxNum);
                    _data.writeInt(((onlyPlugin)?(1):(0)));
                    mRemote.transact(Stub.TRANSACTION_getTasks, _data, _reply, 0);
                    _reply.readException();
                    java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
                    _result = _reply.readArrayList(cl);
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public java.util.List getRecentTasks(int vuid, java.lang.String packageName, int maxNum, int flags) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.util.List _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    _data.writeInt(maxNum);
                    _data.writeInt(flags);
                    mRemote.transact(Stub.TRANSACTION_getRecentTasks, _data, _reply, 0);
                    _reply.readException();
                    java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
                    _result = _reply.readArrayList(cl);
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean isPluginTask(int vuid, int taskId, java.lang.String callingPackage) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeInt(taskId);
                    _data.writeString(callingPackage);
                    mRemote.transact(Stub.TRANSACTION_isPluginTask, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void fixPluginTaskInfo(int vuid, android.app.ActivityManager.RecentTaskInfo taskInfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((taskInfo!=null)) {
                        _data.writeInt(1);
                        taskInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_fixPluginTaskInfo, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        taskInfo.readFromParcel(_reply);
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void onServiceCreated(int vuid, android.content.pm.ServiceInfo proxyInfo, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((proxyInfo!=null)) {
                        _data.writeInt(1);
                        proxyInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((targetInfo!=null)) {
                        _data.writeInt(1);
                        targetInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_onServiceCreated, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void onServiceDestory(int vuid, android.content.pm.ServiceInfo proxyInfo, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((proxyInfo!=null)) {
                        _data.writeInt(1);
                        proxyInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((targetInfo!=null)) {
                        _data.writeInt(1);
                        targetInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_onServiceDestory, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public java.util.List<android.content.pm.ServiceInfo> getTargetServiceInfo(int vuid, java.lang.String proxyProcessName, android.content.ComponentName proxyName) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.util.List<android.content.pm.ServiceInfo> _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(proxyProcessName);
                    if ((proxyName!=null)) {
                        _data.writeInt(1);
                        proxyName.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getTargetServiceInfo, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createTypedArrayList(android.content.pm.ServiceInfo.CREATOR);
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int startProcess(int vuid, android.os.Bundle arg, boolean bindApp, boolean bindAppSync, int type, java.lang.String reason, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((arg!=null)) {
                        _data.writeInt(1);
                        arg.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeInt(((bindApp)?(1):(0)));
                    _data.writeInt(((bindAppSync)?(1):(0)));
                    _data.writeInt(type);
                    _data.writeString(reason);
                    if ((caller!=null)) {
                        _data.writeInt(1);
                        caller.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_startProcess, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void registerServiceConn(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder conn, android.content.pm.ServiceInfo sinfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
                    _data.writeStrongBinder(conn);
                    if ((sinfo!=null)) {
                        _data.writeInt(1);
                        sinfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_registerServiceConn, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void unregisterServiceConn(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder conn) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
                    _data.writeStrongBinder(conn);
                    mRemote.transact(Stub.TRANSACTION_unregisterServiceConn, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public long getBindId(int vuid, android.content.pm.ServiceInfo sinfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                long _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((sinfo!=null)) {
                        _data.writeInt(1);
                        sinfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getBindId, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readLong();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int stopService(int vuid, android.content.pm.ServiceInfo serviceInfo, android.content.Intent intent) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((serviceInfo!=null)) {
                        _data.writeInt(1);
                        serviceInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((intent!=null)) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_stopService, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void finishStaticBroadcast(int vuid, android.content.pm.ActivityInfo ainfo, com.excelliance.kxqp.platform.parcel.PendingResultInfo resultInfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((ainfo!=null)) {
                        _data.writeInt(1);
                        ainfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    if ((resultInfo!=null)) {
                        _data.writeInt(1);
                        resultInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_finishStaticBroadcast, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void registerReceiver(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB cb, android.os.IBinder receiver, android.content.IntentFilter filter) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
                    _data.writeStrongBinder(receiver);
                    if ((filter!=null)) {
                        _data.writeInt(1);
                        filter.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_registerReceiver, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void unregisterReceiver(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB cb, android.os.IBinder receiver) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
                    _data.writeStrongBinder(receiver);
                    mRemote.transact(Stub.TRANSACTION_unregisterReceiver, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public boolean isBroadcastIntentTargetToPlugin(int vuid, android.content.Intent intent) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((intent!=null)) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_isBroadcastIntentTargetToPlugin, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean isBroadcastIntentTargetToPluginNew(int vuid, android.content.Intent intent) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    if ((intent!=null)) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_isBroadcastIntentTargetToPluginNew, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean isAllowedPackageRunning(int vuid, java.lang.String packageName) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    mRemote.transact(Stub.TRANSACTION_isAllowedPackageRunning, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public com.excelliance.kxqp.platform.parcel.LBNotificationRecord recordNotification(int vuid, java.lang.String packageName, int id, java.lang.String tag) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                com.excelliance.kxqp.platform.parcel.LBNotificationRecord _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    _data.writeInt(id);
                    _data.writeString(tag);
                    mRemote.transact(Stub.TRANSACTION_recordNotification, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = com.excelliance.kxqp.platform.parcel.LBNotificationRecord.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void removeNotification(int vuid, java.lang.String packageName, int id, java.lang.String tag) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    _data.writeInt(id);
                    _data.writeString(tag);
                    mRemote.transact(Stub.TRANSACTION_removeNotification, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void cancelAllNotifications(int vuid, java.lang.String packageName) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    mRemote.transact(Stub.TRANSACTION_cancelAllNotifications, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public java.lang.String getEnabledNotificationListenerServices(int vuid) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.lang.String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    mRemote.transact(Stub.TRANSACTION_getEnabledNotificationListenerServices, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int checkPermission(int vuid, java.lang.String permission, int pid, int uid) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(permission);
                    _data.writeInt(pid);
                    _data.writeInt(uid);
                    mRemote.transact(Stub.TRANSACTION_checkPermission, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public java.lang.String getSettingsProviderString(int vuid, int db, java.lang.String key) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.lang.String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeInt(db);
                    _data.writeString(key);
                    mRemote.transact(Stub.TRANSACTION_getSettingsProviderString, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void putSettingsProviderString(int vuid, int db, java.lang.String key, java.lang.String value) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeInt(db);
                    _data.writeString(key);
                    _data.writeString(value);
                    mRemote.transact(Stub.TRANSACTION_putSettingsProviderString, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void recordPendingIntent(android.os.IBinder binder, java.lang.String callerPackage, android.content.Intent proxyIntent) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder(binder);
                    _data.writeString(callerPackage);
                    if ((proxyIntent!=null)) {
                        _data.writeInt(1);
                        proxyIntent.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_recordPendingIntent, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void removePendingIntent(android.os.IBinder binder) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder(binder);
                    mRemote.transact(Stub.TRANSACTION_removePendingIntent, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public com.excelliance.kxqp.platform.parcel.LBPendingIntentWrapper getPendingIntentData(android.os.IBinder binder) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                com.excelliance.kxqp.platform.parcel.LBPendingIntentWrapper _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder(binder);
                    mRemote.transact(Stub.TRANSACTION_getPendingIntentData, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = com.excelliance.kxqp.platform.parcel.LBPendingIntentWrapper.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public com.excelliance.kxqp.platform.parcel.LBParceledListSlice getRunningAppProcesses(int vuid, int flags) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                com.excelliance.kxqp.platform.parcel.LBParceledListSlice _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeInt(flags);
                    mRemote.transact(Stub.TRANSACTION_getRunningAppProcesses, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = com.excelliance.kxqp.platform.parcel.LBParceledListSlice.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public com.excelliance.kxqp.platform.parcel.LBParceledListSlice getRunningServices(int vuid, int maxNum, boolean onlyPlugin) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                com.excelliance.kxqp.platform.parcel.LBParceledListSlice _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeInt(maxNum);
                    _data.writeInt(((onlyPlugin)?(1):(0)));
                    mRemote.transact(Stub.TRANSACTION_getRunningServices, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = com.excelliance.kxqp.platform.parcel.LBParceledListSlice.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public java.util.List getRunningAppMemoryInfos(int vuid) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.util.List _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    mRemote.transact(Stub.TRANSACTION_getRunningAppMemoryInfos, _data, _reply, 0);
                    _reply.readException();
                    java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
                    _result = _reply.readArrayList(cl);
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void handleApplicationCrash(int pid, com.excelliance.kxqp.platform.parcel.LBCrashInfo crashInfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(pid);
                    if ((crashInfo!=null)) {
                        _data.writeInt(1);
                        crashInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_handleApplicationCrash, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public boolean hasCrashLogReceiver() throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_hasCrashLogReceiver, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean setRunningPackagesLimit(int userLimit, int monkeyLimit) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(userLimit);
                    _data.writeInt(monkeyLimit);
                    mRemote.transact(Stub.TRANSACTION_setRunningPackagesLimit, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void notifyBadge(int vuid, java.lang.String packageName, com.excelliance.kxqp.platform.parcel.LBBadgeInfo badgeInfo) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    if ((badgeInfo!=null)) {
                        _data.writeInt(1);
                        badgeInfo.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_notifyBadge, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public byte[] getBadgeInfo() throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                byte[] _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getBadgeInfo, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createByteArray();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void splashStart(int vuid, java.lang.String packageName, android.os.Bundle extras) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    if ((extras!=null)) {
                        _data.writeInt(1);
                        extras.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_splashStart, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public void splashStop(int vuid, java.lang.String packageName, android.os.Bundle extras) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(vuid);
                    _data.writeString(packageName);
                    if ((extras!=null)) {
                        _data.writeInt(1);
                        extras.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_splashStop, _data, _reply, 0);
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public boolean setAmsForeground(int value) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(value);
                    mRemote.transact(Stub.TRANSACTION_setAmsForeground, _data, _reply, 0);
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public android.os.Bundle execCommand(java.util.List<java.lang.String> cmds, java.util.Map envs, java.lang.String directory, int flags, android.os.Bundle options) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.Bundle _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStringList(cmds);
                    _data.writeMap(envs);
                    _data.writeString(directory);
                    _data.writeInt(flags);
                    if ((options!=null)) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_execCommand, _data, _reply, 0);
                    _reply.readException();
                    if ((0!=_reply.readInt())) {
                        _result = android.os.Bundle.CREATOR.createFromParcel(_reply);
                    }
                    else {
                        _result = null;
                    }
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }
        static final int TRANSACTION_waitForReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_getLBActivityManagerServicePid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_broadcastIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_startActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_startService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_preStartProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_selectActivityProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_selectServiceProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_selectProviderProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_selectReceiverProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_getTopActivityInTask = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
        static final int TRANSACTION_getTargetPackageNameByPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
        static final int TRANSACTION_getTargetProcessNameByPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
        static final int TRANSACTION_killBackgroundProcesses = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
        static final int TRANSACTION_killApplicationProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
        static final int TRANSACTION_forceStopPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
        static final int TRANSACTION_reportLaunchActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
        static final int TRANSACTION_reportLaunchProxyActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
        static final int TRANSACTION_reportDestroyActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
        static final int TRANSACTION_reportFinishActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
        static final int TRANSACTION_makeActivityProxyIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
        static final int TRANSACTION_makeActivityProxyIntents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
        static final int TRANSACTION_getTasks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
        static final int TRANSACTION_getRecentTasks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
        static final int TRANSACTION_isPluginTask = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
        static final int TRANSACTION_fixPluginTaskInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
        static final int TRANSACTION_onServiceCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
        static final int TRANSACTION_onServiceDestory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
        static final int TRANSACTION_getTargetServiceInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
        static final int TRANSACTION_startProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
        static final int TRANSACTION_registerServiceConn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
        static final int TRANSACTION_unregisterServiceConn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
        static final int TRANSACTION_getBindId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
        static final int TRANSACTION_stopService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
        static final int TRANSACTION_finishStaticBroadcast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
        static final int TRANSACTION_registerReceiver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
        static final int TRANSACTION_unregisterReceiver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
        static final int TRANSACTION_isBroadcastIntentTargetToPlugin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
        static final int TRANSACTION_isBroadcastIntentTargetToPluginNew = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
        static final int TRANSACTION_isAllowedPackageRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
        static final int TRANSACTION_recordNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
        static final int TRANSACTION_removeNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
        static final int TRANSACTION_cancelAllNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
        static final int TRANSACTION_getEnabledNotificationListenerServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
        static final int TRANSACTION_checkPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
        static final int TRANSACTION_getSettingsProviderString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
        static final int TRANSACTION_putSettingsProviderString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
        static final int TRANSACTION_recordPendingIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
        static final int TRANSACTION_removePendingIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
        static final int TRANSACTION_getPendingIntentData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
        static final int TRANSACTION_getRunningAppProcesses = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
        static final int TRANSACTION_getRunningServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
        static final int TRANSACTION_getRunningAppMemoryInfos = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
        static final int TRANSACTION_handleApplicationCrash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
        static final int TRANSACTION_hasCrashLogReceiver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
        static final int TRANSACTION_setRunningPackagesLimit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
        static final int TRANSACTION_notifyBadge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
        static final int TRANSACTION_getBadgeInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
        static final int TRANSACTION_splashStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
        static final int TRANSACTION_splashStop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
        static final int TRANSACTION_setAmsForeground = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
        static final int TRANSACTION_execCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
    }
    public boolean waitForReady() throws android.os.RemoteException;
    public int getLBActivityManagerServicePid() throws android.os.RemoteException;
    public void broadcastIntent(int vuid, android.content.Intent intent, java.util.List<java.lang.String> pkgs, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller, int flags) throws android.os.RemoteException;
    public int startActivity(int vuid, android.content.Intent intent, android.os.IBinder resultTo, int requestCode, android.os.Bundle options, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller) throws android.os.RemoteException;
    public android.content.ComponentName startService(int vuid, android.content.Intent intent, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller) throws android.os.RemoteException;
    public void preStartProcess(int vuid, java.lang.String packageName, int type, android.content.Intent intent, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller) throws android.os.RemoteException;
    public android.content.pm.ActivityInfo selectActivityProxy(int vuid, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException;
    public android.content.pm.ServiceInfo selectServiceProxy(int vuid, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException;
    public android.content.pm.ProviderInfo selectProviderProxy(int vuid, java.lang.String name) throws android.os.RemoteException;
    public android.content.pm.ActivityInfo selectReceiverProxy(int vuid, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException;
    public android.os.IBinder getTopActivityInTask(int vuid, android.content.Intent intent, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getTargetPackageNameByPid(int vuid, int pid) throws android.os.RemoteException;
    public java.lang.String getTargetProcessNameByPid(int vuid, int pid) throws android.os.RemoteException;
    public boolean killBackgroundProcesses(int vuid, java.lang.String packageName) throws android.os.RemoteException;
    public boolean killApplicationProcess(int vuid, java.lang.String pluginPackageName) throws android.os.RemoteException;
    public boolean forceStopPackage(int vuid, java.lang.String pluginPackageName) throws android.os.RemoteException;
    public void reportLaunchActivity(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder token, android.content.pm.ActivityInfo activityInfo, java.lang.String taskAffinity, int taskId, android.content.Intent taskIntent) throws android.os.RemoteException;
    public void reportLaunchProxyActivity(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder token, android.content.pm.ActivityInfo proxyInfo, android.content.pm.ActivityInfo targetInfo, java.lang.String taskAffinity, int taskId, android.content.Intent taskIntent) throws android.os.RemoteException;
    public void reportDestroyActivity(int vuid, android.os.IBinder token) throws android.os.RemoteException;
    public void reportFinishActivity(int vuid, android.os.IBinder token) throws android.os.RemoteException;
    public android.content.Intent makeActivityProxyIntent(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder resultTo, int requestCode, android.content.Intent intent, android.content.pm.ActivityInfo activityInfo, android.os.Bundle options, boolean sourcefromServer, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller, int taskId) throws android.os.RemoteException;
    public android.content.Intent[] makeActivityProxyIntents(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder resultTo, int requestCode, android.content.Intent[] intents, android.content.pm.ActivityInfo[] activityInfos, android.os.Bundle options, boolean sourcefromServer, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller) throws android.os.RemoteException;
    public java.util.List getTasks(int vuid, java.lang.String packageName, int maxNum, boolean onlyPlugin) throws android.os.RemoteException;
    public java.util.List getRecentTasks(int vuid, java.lang.String packageName, int maxNum, int flags) throws android.os.RemoteException;
    public boolean isPluginTask(int vuid, int taskId, java.lang.String callingPackage) throws android.os.RemoteException;
    public void fixPluginTaskInfo(int vuid, android.app.ActivityManager.RecentTaskInfo taskInfo) throws android.os.RemoteException;
    public void onServiceCreated(int vuid, android.content.pm.ServiceInfo proxyInfo, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException;
    public void onServiceDestory(int vuid, android.content.pm.ServiceInfo proxyInfo, android.content.pm.ServiceInfo targetInfo) throws android.os.RemoteException;
    public java.util.List<android.content.pm.ServiceInfo> getTargetServiceInfo(int vuid, java.lang.String proxyProcessName, android.content.ComponentName proxyName) throws android.os.RemoteException;
    public int startProcess(int vuid, android.os.Bundle arg, boolean bindApp, boolean bindAppSync, int type, java.lang.String reason, com.excelliance.kxqp.platform.parcel.LBProcessInfo caller) throws android.os.RemoteException;
    public void registerServiceConn(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder conn, android.content.pm.ServiceInfo sinfo) throws android.os.RemoteException;
    public void unregisterServiceConn(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB client, android.os.IBinder conn) throws android.os.RemoteException;
    public long getBindId(int vuid, android.content.pm.ServiceInfo sinfo) throws android.os.RemoteException;
    public int stopService(int vuid, android.content.pm.ServiceInfo serviceInfo, android.content.Intent intent) throws android.os.RemoteException;
    public void finishStaticBroadcast(int vuid, android.content.pm.ActivityInfo ainfo, com.excelliance.kxqp.platform.parcel.PendingResultInfo resultInfo) throws android.os.RemoteException;
    public void registerReceiver(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB cb, android.os.IBinder receiver, android.content.IntentFilter filter) throws android.os.RemoteException;
    public void unregisterReceiver(int vuid, com.excelliance.kxqp.platform.aidl.IProcessCB cb, android.os.IBinder receiver) throws android.os.RemoteException;
    public boolean isBroadcastIntentTargetToPlugin(int vuid, android.content.Intent intent) throws android.os.RemoteException;
    public boolean isBroadcastIntentTargetToPluginNew(int vuid, android.content.Intent intent) throws android.os.RemoteException;
    public boolean isAllowedPackageRunning(int vuid, java.lang.String packageName) throws android.os.RemoteException;
    public com.excelliance.kxqp.platform.parcel.LBNotificationRecord recordNotification(int vuid, java.lang.String packageName, int id, java.lang.String tag) throws android.os.RemoteException;
    public void removeNotification(int vuid, java.lang.String packageName, int id, java.lang.String tag) throws android.os.RemoteException;
    public void cancelAllNotifications(int vuid, java.lang.String packageName) throws android.os.RemoteException;
    public java.lang.String getEnabledNotificationListenerServices(int vuid) throws android.os.RemoteException;
    public int checkPermission(int vuid, java.lang.String permission, int pid, int uid) throws android.os.RemoteException;
    public java.lang.String getSettingsProviderString(int vuid, int db, java.lang.String key) throws android.os.RemoteException;
    public void putSettingsProviderString(int vuid, int db, java.lang.String key, java.lang.String value) throws android.os.RemoteException;
    public void recordPendingIntent(android.os.IBinder binder, java.lang.String callerPackage, android.content.Intent proxyIntent) throws android.os.RemoteException;
    public void removePendingIntent(android.os.IBinder binder) throws android.os.RemoteException;
    public com.excelliance.kxqp.platform.parcel.LBPendingIntentWrapper getPendingIntentData(android.os.IBinder binder) throws android.os.RemoteException;
    public com.excelliance.kxqp.platform.parcel.LBParceledListSlice getRunningAppProcesses(int vuid, int flags) throws android.os.RemoteException;
    public com.excelliance.kxqp.platform.parcel.LBParceledListSlice getRunningServices(int vuid, int maxNum, boolean onlyPlugin) throws android.os.RemoteException;
    public java.util.List getRunningAppMemoryInfos(int vuid) throws android.os.RemoteException;
    public void handleApplicationCrash(int pid, com.excelliance.kxqp.platform.parcel.LBCrashInfo crashInfo) throws android.os.RemoteException;
    public boolean hasCrashLogReceiver() throws android.os.RemoteException;
    public boolean setRunningPackagesLimit(int userLimit, int monkeyLimit) throws android.os.RemoteException;
    public void notifyBadge(int vuid, java.lang.String packageName, com.excelliance.kxqp.platform.parcel.LBBadgeInfo badgeInfo) throws android.os.RemoteException;
    public byte[] getBadgeInfo() throws android.os.RemoteException;
    public void splashStart(int vuid, java.lang.String packageName, android.os.Bundle extras) throws android.os.RemoteException;
    public void splashStop(int vuid, java.lang.String packageName, android.os.Bundle extras) throws android.os.RemoteException;
    public boolean setAmsForeground(int value) throws android.os.RemoteException;
    public android.os.Bundle execCommand(java.util.List<java.lang.String> cmds, java.util.Map envs, java.lang.String directory, int flags, android.os.Bundle options) throws android.os.RemoteException;
}
android.content.pm.Activi
