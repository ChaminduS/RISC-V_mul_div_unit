import chisel3._
import chisel3.util._



class xor2 extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))
        val out = Output(UInt(1.W))

    })

    io.out := io.a ^ io.b
}

object xor2_verilog extends App {
  (new stage.ChiselStage) .emitVerilog(new xor2())
}