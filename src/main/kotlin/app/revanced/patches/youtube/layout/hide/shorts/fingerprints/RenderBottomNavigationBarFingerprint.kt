package app.revanced.patches.youtube.layout.hide.shorts.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode

object RenderBottomNavigationBarFingerprint : MethodFingerprint(
    opcodes = listOf(
        Opcode.IGET_OBJECT,
        Opcode.MONITOR_ENTER,
        Opcode.IGET_OBJECT,
        Opcode.IF_EQZ,
        Opcode.INVOKE_INTERFACE,
        Opcode.MONITOR_EXIT,
        Opcode.RETURN_VOID,
        Opcode.MOVE_EXCEPTION,
        Opcode.MONITOR_EXIT,
        Opcode.THROW,
    )
)