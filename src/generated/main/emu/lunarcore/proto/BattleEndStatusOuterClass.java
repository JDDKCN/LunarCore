// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class BattleEndStatusOuterClass {
  /**
   * Protobuf enum {@code BattleEndStatus}
   */
  public enum BattleEndStatus implements ProtoEnum<BattleEndStatus> {
    /**
     * <code>BATTLE_END_NONE = 0;</code>
     */
    BATTLE_END_NONE("BATTLE_END_NONE", 0),

    /**
     * <code>BATTLE_END_WIN = 1;</code>
     */
    BATTLE_END_WIN("BATTLE_END_WIN", 1),

    /**
     * <code>BATTLE_END_LOSE = 2;</code>
     */
    BATTLE_END_LOSE("BATTLE_END_LOSE", 2),

    /**
     * <code>BATTLE_END_QUIT = 3;</code>
     */
    BATTLE_END_QUIT("BATTLE_END_QUIT", 3);

    /**
     * <code>BATTLE_END_NONE = 0;</code>
     */
    public static final int BATTLE_END_NONE_VALUE = 0;

    /**
     * <code>BATTLE_END_WIN = 1;</code>
     */
    public static final int BATTLE_END_WIN_VALUE = 1;

    /**
     * <code>BATTLE_END_LOSE = 2;</code>
     */
    public static final int BATTLE_END_LOSE_VALUE = 2;

    /**
     * <code>BATTLE_END_QUIT = 3;</code>
     */
    public static final int BATTLE_END_QUIT_VALUE = 3;

    private final String name;

    private final int number;

    private BattleEndStatus(String name, int number) {
      this.name = name;
      this.number = number;
    }

    /**
     * @return the string representation of enum entry
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * @return the numeric wire value of this enum entry
     */
    @Override
    public int getNumber() {
      return number;
    }

    /**
     * @return a converter that maps between this enum's numeric and text representations
     */
    public static ProtoEnum.EnumConverter<BattleEndStatus> converter() {
      return BattleEndStatusConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static BattleEndStatus forNumber(int value) {
      return BattleEndStatusConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static BattleEndStatus forNumberOr(int number, BattleEndStatus other) {
      BattleEndStatus value = forNumber(number);
      return value == null ? other : value;
    }

    enum BattleEndStatusConverter implements ProtoEnum.EnumConverter<BattleEndStatus> {
      INSTANCE;

      private static final BattleEndStatus[] lookup = new BattleEndStatus[4];

      static {
        lookup[0] = BATTLE_END_NONE;
        lookup[1] = BATTLE_END_WIN;
        lookup[2] = BATTLE_END_LOSE;
        lookup[3] = BATTLE_END_QUIT;
      }

      @Override
      public final BattleEndStatus forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final BattleEndStatus forName(final CharSequence value) {
        if (value.length() == 14) {
          if (ProtoUtil.isEqual("BATTLE_END_WIN", value)) {
            return BATTLE_END_WIN;
          }
        }
        if (value.length() == 15) {
          if (ProtoUtil.isEqual("BATTLE_END_NONE", value)) {
            return BATTLE_END_NONE;
          }
          if (ProtoUtil.isEqual("BATTLE_END_LOSE", value)) {
            return BATTLE_END_LOSE;
          }
          if (ProtoUtil.isEqual("BATTLE_END_QUIT", value)) {
            return BATTLE_END_QUIT;
          }
        }
        return null;
      }
    }
  }
}