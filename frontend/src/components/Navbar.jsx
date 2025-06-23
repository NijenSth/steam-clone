import React from "react";
import { MdOutlineMenu } from "react-icons/md";
import steamlogo from "../assets/steamlogo.png";

const Navbar = () => {
  return (
    <nav className="fixed w-full bg-[#193938]">
      <div className="flex items-center justify-between py-[10px] px-4">
        {/* Left side - Burger menu */}
        <div className="flex items-center">
          <MdOutlineMenu className="text-[#e5d7ae] text-[24px]" />
        </div>

        {/* Center - Logo and text */}
        <div className="flex items-center space-x-3 text-[#e5d7ae] text-[24px] font-semibold absolute left-1/2 transform -translate-x-1/2">
          <img src={steamlogo} alt="Steam logo" className="w-[40px] h-[40px]" />
          <p className="text-[24px] text-[#e5d7ae]">ESTIM</p>
        </div>
        <div className="w-6"></div>
      </div>
      {/* Mid */}
    </nav>
  );
};

export default Navbar;
